package z_etc;

public class Test {

	public static void main(String[] args) {
		Object[]data = method();
		//출력
		
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		

	}
	static Object[] method() {
		String a = "헬로우";
		int b = 100;
		double d = 36.6;
		Object[]data=new Object[3];
		data[0]=a;
		data[1]=new Integer(b);
		data[2]=new Double(d);
		return data;
		
	}

}
