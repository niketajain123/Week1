import java.util.Scanner;
public class SumOfNaturalNumbers{
	//defining method
	public int sumOfNaturalNumbersUsingRecursion(int number){
		if(number==1)
			return 1;
		else
		{
			return number+sumOfNaturalNumbersUsingRecursion(number-1);
		}
	}
	public int sumOfNaturalNumbersUsingFormula(int number){
		int sum=number*(number+1)/2;
		return sum;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//calling method
		SumOfNaturalNumbers sn=new SumOfNaturalNumbers();
		int sum1=sn.sumOfNaturalNumbersUsingRecursion(number);
		int sum2=sn.sumOfNaturalNumbersUsingFormula(number);
		boolean result;
		if(sum1==sum2)
			result=true;
		else
			result=false;
		
		//printing result
		System.out.println("Sum of "+number+" natural numbers using recursion is "+sum1);
		System.out.println("Sum of "+number+" natural numbers using formula is "+sum2);
		System.out.println("Both the sums are equal? "+result);
		//closing sc
		sc.close();
	}
}
