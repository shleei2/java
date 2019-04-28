package e_static;

/*
 *  static 변수 : 각 객체에서 공유하려고 사용한다.
 *  			메모리에 단 하나임!!
 *  			클래스명 접근 가능. (그래서 static 변수 = 클래스 변수)
 */


public class Book {
	private static int count;  //static유무

	public Book() {
		count++;
		System.out.println("책 한권 생성");
	}
	static public int getCount() {
		return count;
	}
}
