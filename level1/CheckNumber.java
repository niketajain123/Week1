import java.util.Scanner;
public class CheckNumber{
	//defining method
	public int checkNumber(int number){
		if(number>0) //positive
		return 1;
		if(number<0) //negative
		return -1;
		else		 //zero
		return 0;
	}
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//calling method
		CheckNumber cn=new CheckNumber();
		int result=cn.checkNumber(number);
		//printing result
		if(result==-1)
		System.out.println("Number "+number+" is negative.");
		else if(result==1)
		System.out.println("Number "+number+" is positive.");
		else
		System.out.println("Number "+number+" is zero.");
		//closing sc
		sc.close();
	}
}
		
		