package h_inherit_book;

public class Main {

	public static void main(String[] args) {

		Item i = null;  //new Item(); 미완성 클래스라서 객체 생성이 안된다
		
		System.out.println("항목을 선택하세요(1.Book 2.Dvd 3.Cd)->");
		int sel = 3;  // 입력값
		switch(sel) {
		case 1 : i = new Book(/* 초기값 */); break;
		case 2 : i = new Dvd(/* 초기값 */); break;
		case 3 : i = new Cd(/* 초기값 */); break;
		}
		i.output();
			
//	//	Book b = new Book();
//	//	b.output();
//		
//		Book b2 = new Book("0001","자바","아무개","엔코아");
//		b2.output();
//		Dvd c = new Dvd("0002","파이선","홍길동","김감독");
//		c.output();
//		Cd d = new Cd("0003", "C언어", "가수");
//		d.output();	
	}

}
