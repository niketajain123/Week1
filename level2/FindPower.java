import java.util.Scanner;
public class FindPower{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variable
		int number,power,result;
		//taking input from user
		System.out.println("Enter number : ");
		number=sc.nextInt();
		System.out.println("Enter power : ");
		power=sc.nextInt();		
		result=1;
		//finding result
		for(int i=1;i<=power;i++){
			result=result*number;
		}
		//printing result
		System.out.println("Result is "+result);
		
		
		//closing sc object
		sc.close();
	}
}
		