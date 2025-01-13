import java.util.Scanner;
public class CheckNumber{
	//defining methods
	public int isPositive(int number){
		if(number>0)
			return 1;
		else if(number<0)
			return -1;
		else
			return 0;
	}
	public int isEven(int number){
		if(number%2==0)
			return 1;
		else
			return 0;
	}
	public int compare(int number1,int number2){
		if(number1>number2)
			return 1;
		else if(number1<number2)
			return -1;
		else
			return 0;
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		CheckNumber cn=new CheckNumber();
		int[]numbers=new int[5];
		int positive,even,com;
		for(int i=0;i<numbers.length;i++){
			System.out.print("Enter number"+(i+1)+" : ");
			numbers[i]=sc.nextInt();
			positive=cn.isPositive(numbers[i]);
			if(positive==1){
				even=cn.isEven(numbers[i]);
				if(even==1)
					System.out.println(numbers[i]+" is positive even number.");
				else
					System.out.println(numbers[i]+" is positive odd number.");
			}
			else if(positive==-1)
					System.out.println(numbers[i]+" is negative number.");
			else
					System.out.println(numbers[i]+" is zero.");
		}
			com=cn.compare(numbers[0],numbers[4]);
			if(com==1)
				System.out.println(numbers[0]+" is greater than "+numbers[4]);
			else if(com==-1)
				System.out.println(numbers[0]+" is smaller than "+numbers[4]);
			else
				System.out.println(numbers[0]+" is equal to "+numbers[4]);
		
		//closing sc
		sc.close();
	}
}
		