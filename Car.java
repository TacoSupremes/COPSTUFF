
public class Car {
	
	//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” - Zachary Scharoun
	
	//declare variables
	private int year;
	
	private String make, model;

	//empty constructor
	public Car(){
		
		year = 0;
		
		make = "-";
		
		model = "-";
	}
	
	//Constructor with arguments
	public Car(int year, String make, String model){
		
		this.year = year;
		
		this.make = make;
		
		this.model = model;
		
	}

	// gets year
	public int getYear() {
		return year;
	}

	// set years
	public void setYear(int year) {
		this.year = year;
	}

	//get make
	public String getMake() {
		return make;
	}

	//set make
	public void setMake(String make) {
		this.make = make;
	}

	// gets Model
	public String getModel() {
		return model;
	}

	// set Model
	public void setModel(String model) {
		this.model = model;
	}
	
	// returns info in a formatted table
	public String toString() {
		
		return this.getYear() + "\t" + this.getMake() + "\t" + this.getModel();
	}
	
	
	
}
