import java.util.*;
public class DistanceConversion{
	public static void main(String[]args){
		//create variables for distance in feets  
		int feets;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in feets using Scanner Object
		System.out.println("Enter length in feets : ");
		feets=sc.nextInt();
		
		//create variables for length in yards and miles
		double yards,miles;
		//logic used for conversion
		// 1 mile = 1760 yards and 1 yard is 3 feet
		yards=(double)feets/3;
		miles=yards/1760;
		//printing the area in cm,and inches
		System.out.println("Length in feets is "+feets+" while in yards is "+yards+" and in miles "+miles);
	}
}