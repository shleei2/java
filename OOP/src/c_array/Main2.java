package c_array;

import java.util.Scanner;
import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생수 입력->");
		int num = input.nextInt();
		input.nextLine();
		Student2[] s = new Student2[num];
		
		//Student[] s = new Student[3];
	
		for(int i = 0; i<s.length; i++) {
			
		
			//for(Student stu:s) {
			s[i] = new Student2();  // 배열, 객체 new // java.lang.NullPointerException  //s[i] = new Student();
			System.out.println((i+1)+"번째 학생의 정보 입력->");
			String info = input.nextLine();
			StringTokenizer st = new StringTokenizer(info);
			s[i].setName(st.nextToken());
			s[i].setKor(Integer.parseInt(st.nextToken()));
			s[i].setEng(Integer.parseInt(st.nextToken()));
			s[i].setMath(Integer.parseInt(st.nextToken()));
			
//			s[i].setName(input.next());
//			System.out.println("국어점수->");
//			s[i].setKor(input.nextInt());
//			System.out.println("영어점수->");
//			s[i].setEng(input.nextInt());
//			System.out.println("수학점수->");
//			s[i].setMath(input.nextInt());
			
			s[i].calTotal();
			s[i].calAverage();
			
			
			System.out.println(s[i]); //주소값
			}
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


