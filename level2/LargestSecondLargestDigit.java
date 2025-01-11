import java.util.Scanner;
public class LargestSecondLargestDigit{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variable
		int number,firstLargest=0,secondLargest=0;
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		int maxDigit=10;
		int digits[]=new int[maxDigit];
		int index=0;
		//removing last digit
		for(int i=0;number!=0||i<maxDigit;i++){
			digits[i]=number%10;
			number=number/10;
		}
		for(int i=0;i<digits.length;i++){
			if(digits[i]>firstLargest)
			{
				secondLargest=firstLargest;
				firstLargest=digits[i];
			}
			if(digits[i]<firstLargest&&digits[i]>secondLargest){
				secondLargest=digits[i];
			}
		}
		//printing first and second largest digits
		System.out.println("First largest digit is "+firstLargest+" and second largest digit is "+secondLargest);
		//closing sc object
		sc.close();
	}
}
		