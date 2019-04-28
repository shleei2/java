package a_basic;
// OOP - Object Oriented Programming
// 클래스 = 서로 다른 자료형의 변수들  + 메소드들

public class Main {

	public static void main(String[] args) {

		Student s = new Student(); // 클래스명 student 클래스변수명 s
		s.name="홍길동";
		
		s.kor=100;
		s.eng=88;
		s.math=77;
		System.out.println("총점: "+ s.calTotal());  
		s.total=300;
		System.out.println("평균: "+ s.calAverage());

	}

}
