import java.util.*;
public class SideOfSquare{
	public static void main(String[]args){
		//create variable for perimeter of square
		int perimeter;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in perimeter using Scanner Object
		System.out.println("Enter perimeter : ");
		perimeter=sc.nextInt();
		
		//create variables for side of square
		int side;
		//logic used for side=>perimeter/4  
	 side=perimeter/4;
		//printing the side of square
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}