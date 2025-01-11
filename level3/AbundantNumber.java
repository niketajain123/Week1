import java.util.Scanner;
public class AbundantNumber{
	public static void main(String[]args){
		//creating Scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variables
		int number,sum=0;
		//taking user input
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		
		//checking Abundant number
		for(int i=1;i<number;i++){
			if(number%i==0)
				sum+=i;
		}
		//checking and printing result
		if(sum>number){
			System.out.println("Number "+number+" is an Abundant number!");
		}
		else{
			System.out.println("Number "+number+" is not an Abundant number!");
		}
		//closing sc object
		sc.close();
	}
}