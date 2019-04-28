package e_static2;

class UserB {
	 DBConnect con;
	 
	 public UserB (){
	  //con = new DBConnect();
	  con = DBConnect.getInstance();
	  
	 }
	 
	 public void use(){
	  System.out.println("디비 작업중");
	 }
	}