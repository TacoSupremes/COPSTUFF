import java.util.Scanner;

public class CarTest {

	
//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” - Zachary Scharoun
	
	// talks about cars
	public static void main(String[] args){
		
		// setup cars
		Car c1 = new Car(2015, "Ford", "Taurus");
		
		Car c2 = new Car(2007, "Honda", "Accord");
		
		Car c3 = new Car();
		
		//setup scanner
		Scanner scan = new Scanner(System.in);
		
		// print cars 
		System.out.println(c1.toString());
		
		System.out.println(c2.toString());
		
		System.out.println(c3.toString());
		
		// says whoops
		System.out.println("Whoops! It seems we do not have the info on one of his cars!");
		
		// ask for car
		System.out.println("Enter the information for the third car here: ");
		
		// ask for make
		System.out.print("Make: ");
		
		//store make
		c3.setMake(scan.nextLine());
		
		// ask for model
		System.out.print("Model: ");
		
		// store model
		c3.setModel(scan.nextLine());
		
		// ask for year
		System.out.print("Year: ");
		
		// set year
		c3.setYear(scan.nextInt());
		
		//say  that he traded his car in
		System.out.println("Mr. Smith traded the Taurus for another Ford from the same year.");
		
		//ask for model
		System.out.print("Enter the new Ford model: ");
		
		//store model
		c1.setModel(scan.next());
		
		// say that mr smith sold his second car and use getters
		System.out.println("Mr. Smith sold the " + c2.getMake() + " " + c2.getModel() + " to buy a more current version.");
		
		//ask for new model
		System.out.print("Enter the new year for the " + c2.getModel() + ": ");
		
		// store year of second car
		c2.setYear(scan.nextInt());
		
		//add space
		System.out.println();
		
		//print cars and the updated info
		System.out.println("Here is the updated information I now have on Mr. Smith's three cars:");
		
		System.out.println(c1.toString());
		
		System.out.println(c2.toString());
		
		System.out.println(c3.getYear() + "\t" + c3.getMake() + "\t" + c3.getModel());
	}
	
}
