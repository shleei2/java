package h_inherit;

public class Test {

	public static void main(String[] args) {
////		// 1. 클래스 생성과 메소드 호출 확인
////		Umma u = new Umma();
////		u.gene();
////		u.job();
////		//u.study();
////		
////		Ddal d = new Ddal();
////		d.gene();
////		d.study();
////		d.job(); // 자식은 부모클래스 사용 가능
////				
//		//2. 부모변수에 자식객체 		Umma uu = new Ddal();
//		uu.gene();  
//		uu.job();생성
//	//	Ddal dd = new Umma();
//
//	//	uu.study();
//		
//		// ****overriding
//		// - 부모자식간의 메소드명이 동일
//		// - 인자동일 / 리턴형동일
//		// - 접근지정자는 같거나 크거나
//		// * 부모변수에서 자식의 멤버 호출
//		
//		// 3.형변환(casting) - 상속관계에서만 가능
		
	//	Umma u = new Umma();
	//	Ddal d = (Ddal)u;

//		Ddal d = new Ddal();
//		Umma u = (Umma)d;
//		d.study();
		
//		Umma uu = new Ddal();
//		uu.gene();
//		uu.job();
//		Ddal dd = (Ddal)uu;
//		dd.study();
		
		// 4. instanceof 연산자
		Ddal d = new Ddal();
		if(d instanceof Ddal) {
			System.out.println("Ddal 객체임");
		}
		
		if(d instanceof Umma) {
			System.out.println("Umma 객체임");
		}
		if(d instanceof Object) {
			System.out.println("Object 객체임");
		}

		
		
		
		
		
		
	}

}

