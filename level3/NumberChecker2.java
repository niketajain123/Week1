import java.util.Scanner;
public class NumberChecker2{
	public static int countDigits(int number){
		int count=0;
		while(number!=0){
			count++;
			number=number/10;
		}
		return count;
	}
	public static int[] digitsOfNumber(int number){
		int count=countDigits(number);
		int []digits=new int[count];
		for(int i=count-1;i>=0;i--){
			digits[i]=number%10;
			number=number/10;
		}
		return digits;
	}
	public static int sumOfSquare(int[]digits){
		int sumOfSquare=0;
		for(int i=0;i<digits.length;i++){
			sumOfSquare+=Math.pow(digits[i],2);
	}
		return sumOfSquare;
	}
	public static boolean isHarshad(int[]digits){
		int number=0;
		int sum=0;
		for(int i=0;i<digits.length;i++){
			sum+=digits[i];
			number=number*10+digits[i];
		}
			if(number%sum==0)
				return true;
			else
				return false;
	}
	public static int[][] frequencyWithDigit(int[]digits){
			int[][]frequency=new int[digits.length][2];
			for(int i=0;i<digits.length;i++){
				int fr=0;
				for(int j=0;j<digits.length;j++){
					if(digits[i]==digits[j])
					fr++;
				}
				frequency[i][0]=digits[i];
				frequency[i][1]=fr;
			}
		return frequency;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//calling methods
		int[]digits=digitsOfNumber(number);
		System.out.println("Number of digits are " +countDigits(number));
		System.out.println("Digits are : ");
		for(int i=0;i<digits.length;i++)
			System.out.print(digits[i]+" ");
		System.out.println();
		System.out.println("Sum of square of digits is "+sumOfSquare(digits));
		System.out.println("Number is harshard number? " +isHarshad(digits));
		System.out.println("Frequency of digits are : ");
		int[][]frequency=frequencyWithDigit(digits);
		for(int i=0;i<digits.length;i++){
			System.out.println(frequency[i][0]+" => "+frequency[i][1]);
		}
		//closing sc
		sc.close();
	}
}
	
		
		