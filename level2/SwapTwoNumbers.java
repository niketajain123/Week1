import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main(String[]args){
		//declaring variables
		int firstNumber, secondNumber;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter firstNumber : ");
		firstNumber=sc.nextInt();
		System.out.println("Enter secondNumber : ");
		secondNumber=sc.nextInt();
		//swapping numbers
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		//printing numbers after swapping
		System.out.println("The swapped numbers are "+firstNumber+" and "+secondNumber);
	}
}
