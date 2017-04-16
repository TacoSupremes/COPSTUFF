
public class Shape {

	//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” - Zachary Scharoun

	//name variable
	private String name;
	
	//sides
	private int sides;
	
	// total number of shapes
	public static int numberofShapes;
	
	public Shape(){
		
		//add 1 to totoal number of shapes
		Shape.numberofShapes++;
	}

	// set shape name
	public void setName(String name) {
		this.name = name;
	}

	//set number of sides
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	//return a string that displays sides and name
	public String toString(){
		
		return "Shape: " + name + "\n" + "No. of sides: " + sides;
	}
	
	
	
}
