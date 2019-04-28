package h_inherit_book;

public class Dvd extends Item{
	
	String actor;
	String director;


	Dvd(){
		super();
		System.out.println("Dvd 기본생성자");
	}
	Dvd(String no, String title, String bae, String gam){
		super(no, title);
//		super.no = no;
//		super.title = title;
		this.actor = actor;
		this.director = director;
		System.out.println("director 인자생성자");	
	}
	public void output() {
		System.out.println("책번호:" + no);
		System.out.println("책제목:" + title);
		System.out.println("배우:" + actor);
		System.out.println("감독:" + director);
	}
	
	}



