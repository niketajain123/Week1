import java.util.Scanner;
public class SumOfNaturalNumbers{
	//defining method
	public int sumOfNaturalNumbers(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		return sum;
	}
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//calling method
		SumOfNaturalNumbers sn=new SumOfNaturalNumbers();
		int result=sn.sumOfNaturalNumbers(number);
		//printing result
		System.out.println("Sum of "+number+" natural numbers is "+result);
		//closing sc
		sc.close();
	}
}
		
		