import java.util.Scanner;
public class Armstrong{
	public static void main(String[]args){
		//creating Scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variables
		int originalNumber;
		//taking user input
		System.out.println("Enter a number : ");
		originalNumber=sc.nextInt();
		//checking armstrong number
		int sum=0;
		int number=originalNumber;
		int digit,digitCube;
		while(number!=0){
			digit=number%10;
			digitCube=digit*digit*digit;
			sum+=digitCube;
			number=number/10;
		}
		if(sum==originalNumber)
			System.out.println("Armstrong number!");
		else
			System.out.println("Not an Armstrong number!");
		//closing sc object
		sc.close();
	}
}