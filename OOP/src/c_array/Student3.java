package c_array;

// 클래스 = 서로 다른 자료형의 변수들 + 메소드들
/*
 *  캡슐화 = 권한관련부여
 *  1.맴버변수 - private (다른 클래스에서 접근 허용 안함)
 *  2.맴버메소드 - public (모든 접근 허용)
 */
public class Student3 {
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	
	//생성자 함수
	//클래스명과 동일명
	//리턴형없음(void도 없어야)
	//overloading
	
	public Student3() {
		this("무명",10,20,30);
	}
	
	public Student3(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	

	
	
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
	
	// 멤버변수 출력하기 위한 메소드
	public String toString() {
		return name + "학생 총점 :" + total + "/평균:" + avg;
	}

	
	
	
	
	
}