import java.util.Scanner;
public class AllFactors{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variable
		int number;
		//taking input from user
		System.out.println("Enter number : ");
		number=sc.nextInt();
		
		//finding factors
		for(int i=1;i<number;i++){
			if(number%i==0){
			//printing result
			System.out.println(i);
			}
		}
		//closing sc object
		sc.close();
	}
}
		