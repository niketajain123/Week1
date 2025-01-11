import java.util.Scanner;
public class AllMultiple{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variable
		int number;
		//taking input from user
		System.out.println("Enter number : ");
		number=sc.nextInt();
		
		//finding factors
		for(int i=100;i>=1;i--){
			if(number%i==0){
			//printing result
			System.out.println(i);
			}
		}
		//closing sc object
		sc.close();
	}
}
		