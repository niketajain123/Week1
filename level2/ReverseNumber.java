import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//declaring variables
		int number,count=0;
		//taking input from user
		System.out.print("Enter a number to reverse : ");
		number=sc.nextInt();
		//counting digits;
		int temp=number;
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		//creating array for storing digits
		int[]digits=new int[count];
		temp=number;
		//storing digits in array from right to left
		for(int i=count-1;i>=0;i--){
			digits[i]=temp%10;
			temp=temp/10;
		}
		//printing number in reverse
		System.out.println("Original  number is "+number);
		System.out.print("Its reverse is ");
		for(int i=count-1;i>=0;i--){
			System.out.print(digits[i]);
		}
		//closing sc
		sc.close();
	}
}
		