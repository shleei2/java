package h_inherit_book;

// import h_inherit.book.sub.Item

public class Cd extends Item{

	String singer;



	Cd(){
		super();
		System.out.println("Cd 기본생성자");
	}
	Cd(String no, String title, String singer){
		super(no, title);
		//		super.no = no;
		//		super.title = title;
		this.singer = singer;

		System.out.println("singer 인자생성자");	
	}
	public void output() {
		System.out.println("책번호:" + no);
		System.out.println("책제목:" + title);
		System.out.println("배우:" + singer);		
	}
	
}



