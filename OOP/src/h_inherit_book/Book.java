package h_inherit_book;
// 자식클래스
public class Book extends Item{
	String writer;
	String publisher;


	Book(){
		super();
		System.out.println("Book 기본생성자");
	}
	Book(String no, String title, String writer, String publisher){
		super(no, title);
//		super.no = no;
//		super.title = title;
		this.writer = writer;
		this.publisher = publisher;
		System.out.println("Book 인자생성자");	
	}
	public void output() {
		System.out.println("책번호:"+no);
		System.out.println("책제목:"+title);
		System.out.println("작가:"+writer);
		System.out.println("출판사:"+publisher);
	}
	}

