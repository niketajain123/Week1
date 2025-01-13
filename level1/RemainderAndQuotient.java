import java.util.Scanner;
public class RemainderAndQuotient{
	//defining method
	public int[] findRemainderAndQuotient(int number1, int number2){
		int[]answer=new int[2];
		answer[0]=number1/number2; //quotient
		answer[1]=number1%number2; //remainder		
		return answer;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter number1 : ");
		int number1=sc.nextInt();
		System.out.print("Enter number2 : ");
		int number2=sc.nextInt();
		//calling method
		RemainderAndQuotient rq=new RemainderAndQuotient();
		int[]answer=rq.findRemainderAndQuotient(number1,number2);
		//printing result
		System.out.println("Quotient is "+answer[0]);
		System.out.println("Remainder is  "+answer[1]);
		//closing sc
		sc.close();
		
	}
}
		