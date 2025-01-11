import java.util.Scanner;
public class FizzBuzzUsingWhile{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring a number variable
		int number;
		int i=0;
		//taking input from user
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		
		//printing numbers and valid statemets using while
		while(i<=number){
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
			i++;
		}
		//closing sc object
		sc.close();
	}
}
		