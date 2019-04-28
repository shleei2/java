package h_inherit_lang;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		char a;
		Lang i = null;

		do {
			System.out.println("항목을 선택하세요(1.Kor 2.Eng 3.Jp)->" );
			Scanner input = new Scanner(System.in);
			int sel = input.nextInt();
			switch(sel) {
			case 1 : i = new Kor(/* 초기값 */); break;
			case 2 : i = new Eng(/* 초기값 */); break;
			case 3 : i = new Jp(/* 초기값 */); break;
			}

			System.out.println("메시지를 선택하세요(1.인사말 2.자기소개 3.하고픈말)->" );
			Scanner input2 = new Scanner(System.in);
			int sel2 = input2.nextInt();
			switch(sel2) {
			case 1 : i.insa(/* 초기값 */); break;
			case 2 : i.jagi(/* 초기값 */); break;
			case 3 : i.hago(/* 초기값 */); break;
			}
			System.out.println("또? y");
			Scanner input3 = new Scanner(System.in);
			a = input3.next().charAt(0);

		}while(a=='y');

	}
}
