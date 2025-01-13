import java.util.Scanner;
public class Factors{
	//defining methods
	public static int[] findFactors(int number){
		int count=0;
		//counting number of factors
		for(int i=1;i<=number;i++){
			if(number%i==0)
				count++;
		}
		int[]factorArray=new int[count];
		int index=0;
		//storing factors intoan array
		for(int i=1;i<=number;i++){
			if(number%i==0){
				factorArray[index]=i;
				index++;
			}
		}
		return factorArray;
	}
	public int sumOfFactors(int []factorArray){
		int sum=0;
		for(int i=0;i<factorArray.length;i++){
			sum+=factorArray[i];
		}
		return sum;
	}
	public int productOfFactors(int []factorArray){
		int product=1;
		for(int i=0;i<factorArray.length;i++){
			product*=factorArray[i];
		}
		return product;
	}
	public int sumOfSquareOfFactors(int []factorArray){
		int sumOfSquare=0;
		for(int i=0;i<factorArray.length;i++){
			sumOfSquare+=Math.pow(factorArray[i],2);
		}
		return sumOfSquare;
	}
	//main method
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//calling static method
		int []factors=findFactors(number);
		//printing factors
		System.out.println("Factors of "+number+" are =>"); 
		for(int i=0;i<factors.length;i++){
			System.out.print(factors[i]+" ");
		}
		System.out.println();
		//calling instance methods
		Factors fr=new Factors();
		int sum=fr.sumOfFactors(factors);
		//printing sum
		System.out.println("Sum of factors is "+sum);
		int product=fr.productOfFactors(factors);
		//printing products
		System.out.println("Product of factors is "+product);
		int sumOfSquare=fr.sumOfSquareOfFactors(factors);
		//printing sum of square of factors
		System.out.println("Sum of square of factors is "+sumOfSquare);
		//closing sc
		sc.close();
	}
}
	