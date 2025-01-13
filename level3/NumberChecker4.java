import java.util.Scanner;
public class NumberChecker4{
	
	public static boolean isPrime(int number){
		for(int i=2;i<number;i++){
			if(number%i==0)
				return false;
		
		}
			return true;
	}
	public static boolean isNeon(int number){
		int digits[]=NumberChecker2.digitsOfNumber(number);
		int sumOfSquare=NumberChecker2.sumOfSquare(digits);
		if(number==sumOfSquare)
			return true;
		else
			return false;
	}
		
	
	public static boolean isSpy(int number){
		int[]digits=NumberChecker2.digitsOfNumber(number);
		int sum=0;
		int product=1;
		for(int i=0;i<digits.length;i++){
			sum+=digits[i];
			product*=digits[i];
		}
		if(sum==product)
			return true;
		else
			return false;
	}
	public static boolean isAutomorphic(int number){
		int square=(int)Math.pow(number,2);
		while(number>0){
			if(square%10!=number%10)
				return false;
			square=square/10;
			number=number/10;
		}
		return true;
	}
	public static boolean isBuzz(int number){
		if(number%10==7||number%7==0)
			return true;
		else 
			return false;
	}
		
			
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//calling methods
		
		System.out.println("Number is prime? " +isPrime(number));
		System.out.println("Number is Neon? "+isNeon(number));
		System.out.println("Number is Spy? " +isSpy(number));
		System.out.println("Number is Automorphic? "+isAutomorphic(number));
		System.out.println("Number is Buzz? " +isBuzz(number));
		//closing sc
		sc.close();
	}
}
	
		
		