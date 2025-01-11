public class ProfitLoss{
	public static void main(String[]args){
		//create a variable costPrice to indicate cost price
		int costPrice=129;
		//create a variable sellingPrice to indicate selling price
		int sellingPrice=191;
		//create a variable profitInNum to indicate profit in numbers
		//logic used for profit number=> profit=sellingPrice-costPrice
		int profitInNum=sellingPrice-costPrice;
		//createa variable profitPercentage to indicate profit in percent
		//logic used for profit percent=> profit/costPrice*100
		double profitPercentage=(double)profitInNum/costPrice*100;
		//printing cost price, selling price, profit in number and profit percent in single line
		System.out.println("The Cost Price is INR"+costPrice+" and Selling Price is INR"+sellingPrice+"\nThe Profit is INR"+profitInNum +"and the Profit Percentage is" +profitPercentage);
	}
}