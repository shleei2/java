package i_final;

/*
  final - 변경불가
  final field - 값 변경 불가
  final method - overriding 불가
  final class - 상속불가
 */
class Parent{
	String field = "부모님꺼"; //final 값 변경 불가 field="내꺼임";
	public void job() { //final 
		//field = "진짜내꺼";
		System.out.println("부모님께서 장만");
	}
}
class Child extends Parent{
	Child(){
		field="내꺼임";		
	}
	public void job() {
		System.out.println("물려받아 탕진");
	}
}
public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.job();
	}
}
