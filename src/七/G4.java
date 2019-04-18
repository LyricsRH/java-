package Æß;

public class G4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date date=new Date(20,Month.JULY,1969);
     System.out.println(date.getYear()+" "+date.getMonth()+" "+ date.getDay());
     System.out.println(date.getMonth()+" "+date.getDay());
     System.out.println(date.toString());
	}

}

class Date{
	
	private int year;
	private int month;
    private int day;
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public Month[] getMont() {
		return mont;
	}

	
	
	public Date(){
		this.year=1990;
		this.month=1;
		this.day=1;
	}
	
	Month[] mont=  Month.values();
	public Date(Month month,int day,int year){
		this.day=day;
		this.year=year;
		for(int i=0;i<mont.length;i++){
			if (month==mont[i]) {
				this.month=i+1;
			}
		}
	}

    public Date(int day,Month month,int year){
    	this(month,day,year);
    }

    public String toString(){
    	
    	return this.day+"-"+this.mont[this.month-1].toString().substring(0,3)+"-"+this.year;
 
    }
  }
