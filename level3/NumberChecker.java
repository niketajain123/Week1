import java.util.Scanner;
public class NumberChecker{
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
		for(int i=0;i<count;i++){
			digits[i]=number%10;
			number=number/10;
		}
		return digits;
	}
	public static boolean isDuck(int number){
		int[]digits=digitsOfNumber(number);
		boolean result=true;
		
		for(int i=0;i<digits.length;i++){
			if(digits[i]==0){
				result=false;
				break;
			}
		}
		return result;
	}
	public static boolean isArmstrong(int[]digits){
		int pow=digits.length;
		int number=0;
		for(int i=digits.length-1;i>=0;i--){
			number=number*10+digits[i];
		}
		int armstrong=0;
		for(int i=0;i<digits.length;i++){
			armstrong+=Math.pow(digits[i],pow);
		}
		if(number==armstrong)
			return true;
		else
			return false;
	}
	public static int[] largestSecondLargest(int[]digits){
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int[]largest=new int[2];
		for(int i=0;i<digits.length;i++){
			if(digits[i]>max1){
				max2=max1;
				max1=digits[i];
			}
			if(digits[i]<max1&&digits[i]>max2)
				max2=digits[i];
		}
		largest[0]=max1;
		largest[1]=max2;
		return largest;
	}
	public static int[] smallestSecondSmallest(int[]digits){
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		int[]smallest=new int[2];
		for(int i=0;i<digits.length;i++){
			if(digits[i]<min1){
				min2=min1;
				min1=digits[i];
			}
			if(digits[i]>min1&&digits[i]<min2)
				min2=digits[i];
		}
		smallest[0]=min1;
		smallest[1]=min2;
		return smallest;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//calling methods
		System.out.println("Number of digits are " +countDigits(number));
		System.out.println("Number is duck number? "+isDuck(number));
		int[]digits=digitsOfNumber(number);
		System.out.println("Number is armstrong number? " +isArmstrong(digits));
		System.out.println("Largest digit is " +largestSecondLargest(digits)[0]);
		System.out.println("Second Largest digit is " +largestSecondLargest(digits)[1]);
		System.out.println("Smallest digit is " +smallestSecondSmallest(digits)[0]);
		System.out.println("Second Smallest digit is " +smallestSecondSmallest(digits)[1]);
		//closing sc
		sc.close();
	}
}
	
		
		