import java.util.Scanner;
public class FirstSecondLargestVTwo{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variable
		long number;
		int firstLargest=0,secondLargest=0;
		System.out.println("Enter a number : ");
		number=sc.nextLong();
		int maxDigit=10;
		int digits[]=new int[maxDigit];
		int index=0;
		//removing last digit
		while(number!=0){
			if(index==maxDigit){
				maxDigit+=10;
				int[]temp=new int[maxDigit];
				//copying
				for(int j=0;j<index;j++){
					temp[j]=digits[j];
				}
				digits=temp;
			}
			//storing
			digits[index]=(int)number%10;
			number=number/10;
			index++;
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
		