import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring a number variable
		int number;
		//taking input from user
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		
		//printing numbers and valid statemets
		for(int i=0;i<=number;i++){
			if(i%5==0&&i%3==0){
				System.out.println("FizzBuzz");
			}
			else if(i%5==0){
				System.out.println("Buzz");				
			}
			else if(i%3==0){
				System.out.println("Fizz");				
			}
			else{
				System.out.println(i);				
			}
		}
		//closing sc object
		sc.close();
	}
}
		