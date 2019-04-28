package h_inherit_book;

// 부모클래스
public abstract class Item {  //abstract
	 protected String no;
	 protected String title;

	public Item(){
		System.out.println("Item 기본생성자");
	}

	public Item(String no, String title){
		this.no = no;
		this.title = title;
		System.out.println("item 인자생성자");
	}
	
	public abstract void output(); // {}:함수표시는 아무일도 하지 않지만 완벽한 함수 구현  //abstract 미완성 메소드 신호
}
