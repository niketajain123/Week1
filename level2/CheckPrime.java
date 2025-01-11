import java.util.Scanner;
public class CheckPrime{
	public static void main(String[]args){
		//creating scanner object for taking input
		Scanner sc=new Scanner(System.in);
		//declaring variable number to indicate number which we want to check
		int number;
		//declaring boolean for result
		boolean isPrime=true;
		//taking input from user
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		//checking prime number using for loop
		int i;
		for( i=2;i<number;i++){
			if(number%i==0){
				isPrime=false;
				break;
			}
		}
		if(i==number){
			isPrime=true;
		}
		else{
			isPrime=false;
		}
	
		//printing output
		System.out.println("Is the number "+number+" a prime number? "+isPrime);
		//closing the scanner object
		sc.close();
	}
}