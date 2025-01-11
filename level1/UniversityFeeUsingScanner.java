import java.util.*;
public class UniversityFeeUsingScanner{
	public static void main(String[]args){
		//create variables for fee and discount percent
		int fee,discountPercent;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in fee and discount using Scanner Object
		System.out.println("Enter course fees : ");
		fee=sc.nextInt();
		System.out.println("Enter discount percent : ");
		discountPercent=sc.nextInt();
		//create a variable discount to indicate discount on fees
		//logic used for discount=>fee*10/100
		int discount=fee*discountPercent/100;
		//create a variable feeToPay to indicate remaining fees to pay after discount
		//logic used for feeToPay=fee-discount
		int feeToPay=fee-discount;
		//printing the fee you have to pay after discount
		System.out.println("The discount amount is INR"+discount+" and final discounted fee is INR"+feeToPay);
	}
}