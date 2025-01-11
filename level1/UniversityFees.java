public class UniversityFees{
	public static void main(String[]args){
		//create a variable fee to indicate course fees
		int fee=125000;
		//create a variable discountPercent to indicate percentage discount
		int discountPercent=10;
		//create a variable discount to indicate discount on fees
		//logic used for discount=>fee*10/100
		int discount=fee*10/100;
		//create a variable feeToPay to indicate remaining fees to pay after discount
		//logic used for feeToPay=fee-discount
		int feeToPay=fee-discount;
		//printing the fee you have to pay after discount
		System.out.println("The discount amount is INR"+discount+" and final discounted fee is INR"+feeToPay);
	}
}