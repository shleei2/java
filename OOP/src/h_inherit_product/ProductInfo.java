package h_inherit_product;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductInfo {

    public static void main(String[] args) {
        Product[] product = new Product[5];
        int count = 0;
        while (true) {
            int sel = selectCat();
            // 상품추가
            if (sel == 1) {
                product = insertData(count, product);
                count++;
            // 모든 상품 조회
            } else if (sel == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println("상품ID>>" + i);
                    product[i].showInfo();
                }
            // 끝내기
            } else {
                System.out.println("시스템 종료");
                break;
            }
        }
    }

    // 사용자로부터 상품추가, 조회, 끝내기 선택 입력받음
    public static int selectCat() {
        Scanner input = new Scanner(System.in);
        int sel = 0;
        System.out.println("상품추가(1)," +
                " 모든 상품 조회(2), 끝내기(3)");
        sel = Integer.parseInt(input.nextLine());

        return sel;
    }

    // 사용자로부터 입력받는 상품정보를 배열 list로 반환
    public static ArrayList<String> createList() {
        Scanner input = new Scanner(System.in);
        System.out.println("상품종류 책(1), 음악CD(2), 회화책(3)");
        String sel = input.nextLine();

        String[] booksub = {"상품 설명", "생산자", "가격",
                "책 제목", "저자", "ISBN"};
        String[] disksub = {"상품 설명", "생산자", "가격",
                "앨범 제목", "가수"};
        String[] conbooksub = {"상품 설명", "생산자", "가격",
                "책 제목", "저자", "언어", "ISBN"};
        String[][] sub = {booksub, disksub, conbooksub};

        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < sub[Integer.parseInt(sel) - 1].length; i++) {
            System.out.print(sub[Integer.parseInt(sel) - 1][i] + ">> ");
            list.add(input.nextLine());
        }
        list.add(sel);
        return list;
    }

    // Product 클래스배열에 사용자로부터 입력받는 정보 입력 후
    // Product 배열 반환
    public static Product[] insertData(int count, Product[] product) {
        // product에 5개 이상 들어갈 수 없음
        if (count == 5) {
            System.out.println("더 이상 추가할 수 없습니다.");
            return product;
        }
        // createList 함수를 호출하여 상품 정보를 사용자로부터 받는다.
        ArrayList<String> list = createList();
        int i = Integer.parseInt(list.get(list.size() - 1));
        product[count] = new Product();
        // Book 정보 리스트 리스트를 product에 추가
        if (i == 1) {
            product[count] = new Book(list.get(0), list.get(1),
                    list.get(2),
                    list.get(3), list.get(4), list.get(5));
        // CompactDisk 정보 리스트 리스트를 product에 추가
        } else if (i == 2) {
            product[count] = new CompactDisc(list.get(0),
                    list.get(1), list.get(2), list.get(3),
                    list.get(4));
        // ConversationBook 정보 리스트를 product에 추가
        } else if (i == 3) {
            product[count] = new ConversationBook(list.get(0),
                    list.get(1), list.get(2), list.get(3),
                    list.get(4), list.get(5), list.get(6));
        }
        return product;
    }

}