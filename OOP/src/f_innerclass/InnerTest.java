package f_innerclass;

class Outer{
	static class Inner{  //Outer$Inner.class //class Inner{
		static void najabara() { //void najabara() {
			System.out.println("호출해주세요");
		}
		
	}
}

public class InnerTest {
	
	public static void main(String[] args) {
////		Outer o = new Outer();
////		Outer.Inner in = o.new Inner();
//		Outer.Inner in = new Outer.Inner();
//		in.najabara();
		Outer.Inner.najabara();
		
	}

}
