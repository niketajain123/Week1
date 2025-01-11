import java.util.*;
public class GreatestNumber{
	public static void main(String[]args){
		//declaring variable
		int first,second,third;
		boolean firstGreatest=false,secondGreatest=false,thirdGreatest=false;
		//creating Scanner object for taking input from user
		Scanner sc=new Scanner(System.in);
		//taking input from user
		System.out.println("Enter first number :");
		first=sc.nextInt();
		System.out.println("Enter second number :");
		second=sc.nextInt();
		System.out.println("Enter third number :");
		third=sc.nextInt();
		//checking the largest number
		if(first>second&&first>third){
			firstGreatest=true;
		}
		else if(second>first&&second>third){
			secondGreatest=true;
		}
		else if(third>first&&third>second){
			thirdGreatest=true;
		}
			//printing result
		System.out.println("Is the first number the largest? "+firstGreatest);
		System.out.println("Is the second number the largest? "+secondGreatest);
		System.out.println("Is the third number the largest? "+thirdGreatest);

	}
}