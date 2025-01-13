import java.util.Scanner;
public class NumberChecker3{
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
	public static int[] reverseArray(int[]digits){
		int[]reverse=new int[digits.length];
		for(int i=0,j=digits.length-1;i<digits.length&&j>=0;i++,j--){
			reverse[i]=digits[j];
		}
		return reverse;
	}
	public static boolean compareTwoArray(int[]array1,int[]array2){
		if(array1.length!=array2.length)
			return false;
		for(int i=0;i<array1.length;i++){
			if(array1[i]!=array2[i])
				return false;
		}
		return true;		
	}
	public static boolean isPalindrome(int[]digits){
			int[]reverse=reverseArray(digits);
			boolean result=compareTwoArray(digits,reverse);
			return result;
	}
	public static boolean isDuck(int[]digits){
		boolean result=true;		
		for(int i=0;i<digits.length;i++){
			if(digits[i]==0){
				result=false;
				break;
			}
		}
		return result;
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
		System.out.println("Reverse digits are : ");
		int[]reverse=reverseArray(digits);
		for(int i=0;i<digits.length;i++)
			System.out.print(reverse[i]+" ");
		System.out.println();
		System.out.println("Original number and reverse is equal? " +compareTwoArray(digits,reverse));
		System.out.println("Number is palindrome? "+isPalindrome(digits));
		System.out.println("Number is duck? "+isDuck(digits));

		//closing sc
		sc.close();
	}
}
	
		
		