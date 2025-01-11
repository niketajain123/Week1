import java.util.*;
public class TotalPrice{
	public static void main(String[]args){
		//create variable for unit price and quantity
		int unitPrice,quantity;
		//create Scanner Object to take user input
		Scanner sc = new Scanner(System.in);
		//taking user input in unit price and quantity using Scanner Object
		System.out.println("Enter unit price : ");
		unitPrice=sc.nextInt();
		System.out.println("Enter quantity : ");
		quantity=sc.nextInt();
		
		//create variables for total price
		int totalPrice;
		//logic used for totalPrice=>unitPrice*quantity;  
		totalPrice=unitPrice*quantity;
		//printing the unitPrice, quantity and totalPrice
		System.out.println(" The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}