package d_constructor;

// 클래스 = 서로 다른 자료형의 변수들 + 메소드들
/*
 *  캡슐화 = 권한관련부여
 *  1.맴버변수 - private (다른 클래스에서 접근 허용 안함)
 *  2.맴버메소드 - public (모든 접근 허용)
 */
public class Student {
	//멤버변수
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	
	// 생성자 함수가 하나도 없는 경우
	// java compiler가 자동으로 생성
	// -> 기본생성자는 만든다.
	public Student() {
		// this : 맴버를 지칭하기 위한 레퍼런스
		// this() : 다른 생성자함수 호출 !! 반드시 첫 줄에 기술!!!	
		this("익명",50,50,50);
	/*	this.name="익명";
		this.kor=50;
		this.eng=50;
        this.math=50;
      */
		System.out.println("기본생성자 호출");	
	}
	//생성자 - 멤버변수 초기화
	//클래스명과 동일한 이름의 함수
	//리턴형이 없음(void 안됨)
	//overloading
	public Student(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		System.out.println("인자 있는 생성자 호출");	
	}
	
	//멤버메소드
	public int calTotal() {
		total = kor + eng + math;
		return total;
	}
	
	public double calAverage() {
		avg = (double)total/3;
		return avg;
	}
	// setter / getter // 우클-소스-제너레이트 게터세터

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}
	
	

	
	
	
	
	
}