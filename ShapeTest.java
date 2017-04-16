import java.util.Scanner;

public class ShapeTest {

	//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” - Zachary Scharoun

	
	public static void main(String[] args) {
	
		//declare shapes
		Shape s1 = new Shape();
		
		Shape s2 = new Shape();
		
		Shape s3 = new Shape();
		
		//setup scanner
		Scanner scan = new Scanner(System.in);
		
		//print info on shapes
		System.out.println("Enter info on " + Shape.numberofShapes + " shapes:");
		
		//ask for name of shape
		System.out.println("Enter the name of the shape: ");
		
		//store name
		s1.setName(scan.next());
		
		//ask for sides
		System.out.println("Enter the number of sides: ");
		
		//store sides
		s1.setSides(scan.nextInt());
		
		//print space
		System.out.println();
		
		//ask for name of shape
		System.out.println("Enter the name of the shape: ");
		
		// store name
		s2.setName(scan.next());
		
		// ask for number of sides
		System.out.println("Enter the number of sides: ");
		
		//store sides
		s2.setSides(scan.nextInt());
		
		//print space
		System.out.println();
		
		//ask for shape
		System.out.println("Enter the name of the shape: ");
		
		//store name
		s3.setName(scan.next());
		
		//ask for sides
		System.out.println("Enter the number of sides: ");
		
		//store sides
		s3.setSides(scan.nextInt());
		
		// print info using number of shapes
		System.out.println("Here is the info you entered for the " + Shape.numberofShapes + " shapes: ");
		
		//print 1st shape
		System.out.println(s1.toString());

		//print space
		System.out.println();
		
		// print second shape
		System.out.println(s2.toString());
		
		//print space
		System.out.println();
		
		//print 3rd shape
		System.out.println(s3.toString());
	}

}
