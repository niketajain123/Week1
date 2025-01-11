import java.util.Scanner;
public class ArrayElementsChecking{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//defining array of 5 for checking element
		int[]array=new int[5];
		//taking user input using for loop and showing result
		for(int i=0;i<array.length;i++){
			System.out.print("Enter a number : ");
			array[i]=sc.nextInt();
			}
			//checking positive, negative, even and odd
		for(int i=0;i<array.length;i++){
			if(array[i]>0){
				if(array[i]%2==0)
					System.out.println("Number "+array[i]+" is positive even number.");
				else
					System.out.println("Number "+array[i]+" is positive odd number.");		
			}
			else if(array[i]<0)
				System.out.println("Number "+array[i]+" is negative.");
			else
				System.out.println("Number is zero.");	
		}
		//comparing first and last element
		if(array[0]==array[4])
			System.out.println("Both the numbers are equal");
		else if(array[0]>array[4])
			System.out.println(array[0]+" is greater than "+array[4]);
		else
			System.out.println(array[0]+" is smaller than "+array[4]);

		//closing scanner object
		sc.close();
	}
}
		