import java.util.Scanner;
public class  KmTOMilesUsingScanner{
	public static void main(String[]args){
		//create a variable kilometers to indicate distance in kilometers
		double kilometers;
		//create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		//taking user input in kilometers using Scanner Object
		System.out.println("Enter distance in kilometers : ");
		kilometers=input.nextDouble();
		//create a variable miles to convert distance from kilometers to miles
		double miles=kilometers*1.6;
		//print the conversion details
		System.out.println("The total miles is "+miles+" mile for the given "+kilometers+" km");
	}
}
