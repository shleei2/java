package d_constructor;

public class Main {

	public static void main(String[] args) {
		
		
		Student s2 = new Student("홍길자", 100, 80, 70);
		System.out.println("이름: "+ s2.getName());
		System.out.println("총점: "+ s2.calTotal());  
		System.out.println("평균: "+ s2.calAverage());
	
		Student s = new Student();

		System.out.println("이름: "+ s.getName());
		System.out.println("총점: "+ s.calTotal());  
		System.out.println("평균: "+ s.calAverage());

		
	}

}

