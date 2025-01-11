import java.util.Scanner;
public class ChocolateDistribution{
	public static void main(String[]args){
		//declaring variables
		int numberOfChocolates,numberOfChildren;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter number of chocolates: ");
		numberOfChocolates=sc.nextInt();
		System.out.println("Enter number of children : ");
		numberOfChildren=sc.nextInt();
		//calculating number of chocolates each child gets
		int eachChildGotChocolates=numberOfChocolates/numberOfChildren;
		//calculating number of remaining chocolates 
		int remainingChocolates=numberOfChocolates%numberOfChildren;
		
		//printing output
		System.out.println("The number of chocolates each child gets is "+eachChildGotChocolates+" and the number of remaining chocolates are "+remainingChocolates);
	}
}