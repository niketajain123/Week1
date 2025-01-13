import java.util.Scanner;
public class SmallestAndLargest{
	//defining method
	public int[] findSmallestAndLargest(int number1, int number2,int number3){
		int[]answer=new int[2];
		//smallest and largest
		if(number1<number2&&number1<number3){
			answer[0]=number1;
		answer[1]=(number2>number3)?number2:number3;
		}
		else if(number2<number1&&number2<number3){
			answer[0]=number2;
		answer[1]=(number1>number3)?number1:number3;
		}
		else{
			answer[0]=number3;
		answer[1]=(number1>number2)?number1:number2;
		}
		return answer;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter number1 : ");
		int number1=sc.nextInt();
		System.out.print("Enter number2 : ");
		int number2=sc.nextInt();
		System.out.print("Enter number3 : ");
		int number3=sc.nextInt();
		//calling method
		SmallestAndLargest sl=new SmallestAndLargest();
		int[]answer=sl.findSmallestAndLargest(number1,number2,number3);
		//printing result
		System.out.println("Smallest amongst all is "+answer[0]);
		System.out.println("Largest amongst all is  "+answer[1]);
		//closing sc
		sc.close();
	}
}
		