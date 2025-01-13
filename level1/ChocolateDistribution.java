import java.util.Scanner;
public class ChocolateDistribution{
	//defining method
	public int[] chocolateDistribution(int chocolates, int children){
		int[]answer=new int[2];
		answer[0]=chocolates/children; //chocolate per children
		answer[1]=chocolates%children; //remaining chocolates		
		return answer;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter number of chocolates : ");
		int numberOfChocolates=sc.nextInt();
		System.out.print("Enter number of children : ");
		int numberOfChildren=sc.nextInt();
		//calling method
		ChocolateDistribution cd=new ChocolateDistribution();
		int[]answer=cd.chocolateDistribution(numberOfChocolates,numberOfChildren);
		//printing result
		System.out.println("Chocolates per children => "+answer[0]);
		System.out.println("Remaining chocolates  => "+answer[1]);
		//closing sc
		sc.close();
		
	}
}
		