package zz_hw;

public class GradeExpr {
	int jumsu[];

	GradeExpr(int jumsu[]){
		this.jumsu=jumsu;	
	}

	double getAverage(){
		double average= getTotal()/jumsu.length;
		return average;
	}

	int getTotal(){
		int total = 0;
		for(int i = 0; i<jumsu.length; i++) {
			total = total + jumsu[i];

		}return total;
	}

	int getGoodScore(){
		int good = jumsu[0];
		for(int i = 0; i<jumsu.length; i++) {
			if(good<jumsu[i]) {
				good = jumsu[i];				
			}

		}return good;
	}

	int getBadScore(){
		int bad = jumsu[0];
		for(int i = 0; i<jumsu.length; i++) {
			if(bad>jumsu[i]) {
				bad = jumsu[i];				
			}

		}return bad;
	}
}

