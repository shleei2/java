package c_array;

import java.util.Scanner;
import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생수 입력->");
		int num = input.nextInt();
		input.nextLine();
		Student3[] s = new Student3[num];
		
		//Student[] s = new Student[3];
	
	//	for(int i = 0; i<s.length; i++) {
			
			for(Student3 stu:s) {  //향상된 for문 인덱스 불가능
				System.out.println("학생정보 입력(예) 홍길동/20/20/20");
				String info = input.nextLine();
				StringTokenizer st = new StringTokenizer(info,"/");
				String name = st.nextToken();
				int kor = Integer.parseInt(st.nextToken());
				int eng = Integer.parseInt(st.nextToken());
				int math = Integer.parseInt(st.nextToken());
				
			
				// 클래스 초기화 - 객체생성+값지정
				stu = new Student3(name,kor,eng,math);
				
				
				
				
				
				
//			stu = new Student();  // 배열, 객체 new // java.lang.NullPointerException  //s[i] = new Student();
			
//			System.out.println((i+1)+"번째 학생의 정보 입력->");
//			String info = input.nextLine();
//			StringTokenizer st = new StringTokenizer(info);
//			s[i].setName(st.nextToken());
//			s[i].setKor(Integer.parseInt(st.nextToken()));
//			s[i].setEng(Integer.parseInt(st.nextToken()));
//			s[i].setMath(Integer.parseInt(st.nextToken()));
//			
////			s[i].setName(input.next());
////			System.out.println("국어점수->");
////			s[i].setKor(input.nextInt());
////			System.out.println("영어점수->");
////			s[i].setEng(input.nextInt());
////			System.out.println("수학점수->");
////			s[i].setMath(input.nextInt());
//			
			stu.calTotal();
			stu.calAverage();
//			
			
			System.out.println(stu); //주소값
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


