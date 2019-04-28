package zz_hw;
import java.util.Scanner;
public class GradeTest {

	public static void main(String[] args) {

		

		System.out.print("몇개의 데이터 입력?: ");
		Scanner sc = new Scanner(System.in);
		int dataCount = sc.nextInt();
		int score[]=new int[dataCount];
		//System.out.println();
		System.out.print("데이터를 입력 : ");
		for (int i = 0; i < score.length; i++) {
			score[i]=sc.nextInt();
		}
		System.out.println();
		//점수 출력
		System.out.print("점수들 : ");
		
		for (int i = 0; i < score.length; i++) {
			if(i<score.length-1)
				System.out.print(score[i] + ", ");
			else
				System.out.print(score[i]);
		}
		System.out.println();

		GradeExpr ge = new GradeExpr(score);
		

		System.out.println("총점: "+ ge.getTotal());
		System.out.println("평균: "+ ge.getAverage());  
		System.out.println("최고 점수: "+ ge.getGoodScore());
		System.out.println("최저 점수: "+ ge.getBadScore());

	}

}
