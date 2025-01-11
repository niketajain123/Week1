import java.util.*;
public class IsFirstSmallest{
	public static void main(String[]args){
		//declaring variable
		int first,second,third;
		boolean result;
		//creating Scanner object for taking input from user
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter first number :");
		first=sc.nextInt();
		System.out.println("Enter second number :");
		second=sc.nextInt();
		System.out.println("Enter third number :");
		third=sc.nextInt();
		//checking if first number is smallest
		if(first<second&&first<third){
			result=true;
		}
		else{
			result=false;
		}
		System.out.println("Is the first number the smallest? "+result);
	}
}