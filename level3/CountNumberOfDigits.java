import java.util.Scanner;
public class CountNumberOfDigits{
	public static void main(String[]args){
		//creating Scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variables
		int number,count=0;
		//taking user input
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		//counting digits in a number
		for(;number!=0;number=number/10){
			count++;
		}
		//printing result
			System.out.println("Number of digits are "+count);
		//closing sc object
		sc.close();
	}
}