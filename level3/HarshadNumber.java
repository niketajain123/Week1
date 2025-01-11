import java.util.Scanner;
public class HarshadNumber{
	public static void main(String[]args){
		//creating Scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variables
		int number,originalNumber,sum=0;
		//taking user input
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		originalNumber=number;
		//checking Harshad number
		while(number!=0){
		sum+=number%10;
		number=number/10;
		}
		//checking and printing result
		if(originalNumber%sum==0){
			System.out.println("Number "+originalNumber+" is a Harshad number!");
		}
		else{
			System.out.println("Number "+originalNumber+" is not a Harshad number!");
		}
		//closing sc object
		sc.close();
	}
}