import java.util.Scanner;
public class SimpleInterest{
	
	//defining method for computing simple interest
	public double simpleInterest(int principal, double rate, int time){
		double SI=principal*rate*time/100;
		return SI;
	}
	
	//main() method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter principal amount : ");
		int principal=sc.nextInt();
		System.out.print("Enter rate : ");
		double rate=sc.nextDouble();
		System.out.print("Enter time : ");
		int time=sc.nextInt();
		double result;
		//creating object of SimpleInterest for accessing method
		SimpleInterest SI=new SimpleInterest();
		//calling method
		result=SI.simpleInterest(principal,rate,time);
		//printing result
		System.out.println("The Simple Interest is "+result+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
		//closing sc
		sc.close();
	}
}