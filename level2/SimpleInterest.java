import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[]args){
		//declaring variables
		int principal,time,rate;
		double simpleInterest;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter value of principal amount : ");
		principal=sc.nextInt();
		System.out.println("Enter value of time : ");
		time=sc.nextInt();
		System.out.println("Enter value of rate : ");
		rate=sc.nextInt();
		
		//calculating simple interest
		simpleInterest=(double)principal*rate*time/100;
		//printing number of rounds
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
}
