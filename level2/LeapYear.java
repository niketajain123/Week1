import java.util.Scanner;
public class LeapYear{
	//defining method
	public void isLeapYear(int year){
		
		if(year>=1582){
			if((year%400==0)||(year%100!=0&&year%4==0))
				System.out.println(year+" is a leap year.");
			else
				System.out.println(year+" is not a leap year.");
		}
		else
				System.out.println(year+" is not a valid year.");
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year=sc.nextInt();
		//calling method
		LeapYear ly=new LeapYear();
		ly.isLeapYear(year);		
		//closing sc
		sc.close();
	}
}
