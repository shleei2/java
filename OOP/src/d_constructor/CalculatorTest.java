package d_constructor;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		char result = ' ';
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 2개 입력");
			int i = sc.nextInt();
			int j = sc.nextInt();

			//	;
			//	int num2 = j;

			CalculatorExpr n = new CalculatorExpr();
			n.setNum1(i);
			n.setNum2(j);

			System.out.println("덧셈: "+ n.getAddition());
			System.out.println("뺄셈: "+ n.getSubtraction());
			System.out.println("곱셈: "+ n.getMultyplication());
			System.out.println("나눗셈: "+ n.getDivision());
			System.out.println("다시할래?(Y|y)");
			result = sc.next().charAt(0);
		}
		while(result =='Y' | result =='y');		
	}
}


