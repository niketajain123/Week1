import java.util.*;
public class QuotientAndReminder{
	public static void main(String[]args){
		int number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for number1 and number2 : ");
		number1=sc.nextInt();
		number2=sc.nextInt();
		int quotient=number1/number2;
		int reminder=number1%number2;
		System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+"  of two number "+number1+" and "+number2);	
	}
}		