package c_array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<s.length; i++) {
			s[i] = new Student();  // 배열, 객체 new // java.lang.NullPointerException
			System.out.println("학생명 입력->");
			s[i].setName(input.next());
			System.out.println("국어점수->");
			s[i].setKor(input.nextInt());
			System.out.println("영어점수->");
			s[i].setEng(input.nextInt());
			System.out.println("수학점수->");
			s[i].setMath(input.nextInt());
			
			s[i].calTotal();
			s[i].calAverage();
			
			
			System.out.println(s[i]); //주소값
			
			//System.out.println(s[i].getName()+":"+s[i].getTotal()+"/"+s[i].getAvg());
			
		}

//		Student s = new Student();
//		s.setName("홍길동");
//		s.setKor(100);
//		s.setEng(88);
//		s.setMath(77);
//		
//		System.out.println("이름: "+ s.getName());
//		System.out.println("총점: "+ s.calTotal());  
//		//s.total=300;
//		System.out.println("평균: "+ s.calAverage());

	}

}
