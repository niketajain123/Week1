import java.util.*;
public class CentimeterToFeetAndInches{
	public static void main(String[]args){
		//create variables for height in centimeters 
		int heightInCM;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in fee and discount using Scanner Object
		System.out.println("Enter height in centimeters : ");
		heightInCM=sc.nextInt();
		//create variables for height in inches 
		double heightInInches;	
		//logic used for converting height in inches  
		heightInInches=heightInCM/2.54;
		//create variables for height in feets 
		double heightInFeet;	
		//logic used for converting height in feet  
		heightInFeet=heightInInches/12;
		
		//printing the height in cm, feet and inches
		System.out.println("Your Height in cm is "+heightInCM+" while in feet is "+heightInFeet+" and inches is "+heightInInches);
	}
}