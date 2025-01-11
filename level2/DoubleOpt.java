import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[]args){
		//declaring variables
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter three floating values : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		//performing double operations
		double p=a/b*c;
		double q=a*b+c;
		double r=c+a/b;
		//printing results
		System.out.println("The results of Double Operations are "+p+", "+q+" and "+r);
	}
}
