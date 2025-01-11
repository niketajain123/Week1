import java.util.Scanner;
public class CalculatorUsingSwitch{
	public static void main(String[]args){
		//creating Scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variables
		double first,second;
		String op;
		//taking user input
		System.out.println("Enter first number : ");
		first=sc.nextDouble();
		System.out.println("Enter second number : ");
		second=sc.nextDouble();
		System.out.println("Enter operation(+,-,*,/) : ");
		op=sc.next();
		
		//switch statement and printing result
		switch(op){
			case "+":
			System.out.println(first+"+"+second+"="+(first+second));
			break;
			case "-":
			System.out.println(first+"-"+second+"="+(first-second));
			break;
			case "*":
			System.out.println(first+"*"+second+"="+(first*second));
			break;
			case "/":
			System.out.println(first+"/"+second+"="+(first/second));
			break;
			default:
			System.out.println("Invalid operator!");
		}
		//closing sc object
		sc.close();
	}
}