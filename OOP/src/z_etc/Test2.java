package z_etc;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> data = method();
//		for(int i=0; i<data.size(); i++) {
//			String str = (String)data.get(i);
//			System.out.println(str);
//		}
		for(String s:data) {
			System.out.println(s);
		}

	}
	static ArrayList<String> method() {  // <Generics>명확하게 지정
		String a = "올라";
		String b = "헬로우";
		String c = "안녕";
		ArrayList<String> list = new ArrayList(); //자동으로 공간 확보
		list.add(a);
		list.add(b);
		list.add(c);
		list.add("꼰니치와");
		return list;
	}
}
