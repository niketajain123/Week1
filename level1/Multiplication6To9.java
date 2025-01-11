import java.util.Scanner;
public class Multiplication6To9{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring number variable
		int number;
		//defining array of 4 for table
		int[]table=new int[4];
		//taking user input in number 
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		//table
		for(int i=0;i<4;i++){
			table[i]=number*(i+6);
		}
		//printing table
		for(int i=0;i<4;i++){
			System.out.println(number+"*"+(i+6)+"="+(number*(i+6)));
		}
		//closing scanner object
		sc.close();
	}
}