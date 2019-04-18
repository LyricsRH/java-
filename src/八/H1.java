package °Ë;

public abstract class H1 {

	private String name;
//	private double salary;
	
	public H1(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract double getSalary();
	

}

class HourlyEmployee extends H1{
	
	private int hours;
	private int wage;
	
	public HourlyEmployee(String name){
		super(name);
	}
	
	public void setHourlyRate(int wage){
		this.wage=wage;
	}
	
	public void setHoursWorked(int hours){
		this.hours=hours;
	}
	
	public double getSalary(){
		return this.hours*this.wage;
	}
	
}

class CommissionedEmployee extends H1{
	
	private int  basedollars;
	private int  sallydollars;
	private double rate ;
	
	public CommissionedEmployee(String name){
		super(name);
	}

	public void setBasedollars(int basedollars) {
		this.basedollars = basedollars;
	}

	public void setSallydollars(int sallydollars) {
		this.sallydollars = sallydollars;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double getSalary(){
		return this.basedollars+this.rate*this.sallydollars;
	}
	
}

class SalariedEmploee extends H1{
	
	private int salary;
	
	public SalariedEmploee(String name){
		super(name);
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
    public double getSalary(){
    	return this.salary;
    }	
	
	
	
	
}













