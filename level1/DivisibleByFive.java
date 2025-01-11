import java.util.*;
public class DivisibleByFive{
	public static void main(String[]args){
		//declaring variable
		int number;
		int divisibleBy=5;
		boolean result;
		//creating Scanner object for taking input from user
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter an integer :");
		number=sc.nextInt();
		//checking divisibility by 5
		if(number%5==0){
			result=true;
		}
		else{
			result=false;
		}
		System.out.println("Is the number "+number+" divisible by "+divisibleBy+"? "+result);
	}
}