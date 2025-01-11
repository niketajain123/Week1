import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring number variable
		int number;
		//defining array of 10 for table
		int[]table=new int[10];
		//taking user input in number 
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		//table
		for(int i=0;i<10;i++){
			table[i]=number*(i+1);
		}
		//printing table
		for(int i=0;i<10;i++){
			System.out.println(number+"*"+(i+1)+"="+(number*(i+1)));
		}
		//closing scanner object
		sc.close();
	}
}
		