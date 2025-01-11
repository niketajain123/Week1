import java.util.Scanner;
public class PoundsToKilogram{
	public static void main(String[]args){
		//declaring variables
		int pound;
		double kilogram;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter weight in pounds : ");
		pound=sc.nextInt();
		//converting pounds into kilogram
		kilogram=pound*2.2;
		//printing number of rounds
		System.out.println("The weight of the person in pound is "+pound+" and in kg is "+kilogram);
	}
}
