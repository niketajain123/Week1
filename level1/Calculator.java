import java.util.*;
public class Calculator{
	public static void main(String[]args){
		//create variables for storing numbers 
		double number1,number2;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in number1 using Scanner Object
		System.out.println("Enter first number : ");
		number1=sc.nextDouble();
		//taking user input in number2 using Scanner Object
		System.out.println("Enter second number : ");
		number2=sc.nextDouble();
		//create variables for storing arithmetic operations results 
		double add,sub,mul,div;
		add=number1+number2;
		sub=number1-number2;
		mul=number1*number2;
		div=number1/number2;
		//printing the results
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+add+", "+sub+", "+mul+", and "+div);
	}
}