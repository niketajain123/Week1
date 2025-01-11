import java.util.Scanner;
public class TotalIncome{
	public static void main(String[]args){
		//declaring variables
		int salary,bonus,totalIncome;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter salary : ");
		salary=sc.nextInt();
		System.out.println("Enter bonus : ");
		bonus=sc.nextInt();
		//calculating total income
		totalIncome=salary+bonus;
		//printing salary, bonus and total income
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+totalIncome);
	}
}
