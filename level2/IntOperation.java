import java.util.Scanner;
public class IntOperation{
	public static void main(String[]args){
		//declaring variables
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter three values : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//performing integer operations
		int p=a+b*c;
		int q=a*b+c;
		int r=c+a/b;
		//printing results
		System.out.println("The results of Int Operations are "+p+", "+q+" and "+r);
	}
}
