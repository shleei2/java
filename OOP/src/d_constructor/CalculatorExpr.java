package d_constructor;

public class CalculatorExpr {
	
	private int num1, num2;
	private int add, sub, mul, div;
	

	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getAddition() {	
		add=num1+num2;
		return add;		
	}
	public int getSubtraction() {	
		sub=num1-num2;
		return sub;	
	}
	public int getMultyplication() {	
		mul=num1*num2;
		return mul;
	}
	public double getDivision() {	
		div=num1/num2;
		return div;		
	}
	
	
}
