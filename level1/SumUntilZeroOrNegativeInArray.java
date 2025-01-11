import java.util.Scanner;
public class SumUntilZeroOrNegativeInArray{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);		
		//defining array of 10 
		double[]array=new double[10];
		double n; //for checking input value
		int i=0; //for index
		//taking user input in array 
		while(true){
			if(i==10)
			break;
		System.out.println("Enter a number (zero or negative to stop) : ");
		n=sc.nextDouble();
		
		 if(n<=0)
			break;
		else{
			array[i]=n;
			i++;
			}
		}
		//getting the value and sum
		double sum=0;
		for(int j=0;j<array.length;j++){
			sum+=array[j];
		}
		//printing sum
		System.out.println("The sum of all numbers is "+sum);
		//closing scanner object
		sc.close();
	}
}
		