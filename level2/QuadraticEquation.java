import java.util.Scanner;
public class QuadraticEquation{
	//finding roots
	public double[] findRoots(int a,int b,int c,double delta){
		double[]roots=new double[2];
		if(delta>0)
		{
			roots[0]=(-b+Math.sqrt(delta))/2*a;
			roots[1]=(-b-Math.sqrt(delta))/2*a;
		}
		else if(delta==0)
			roots[0]=-b/(2*a);
		return roots;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter value of a : ");
		int a=sc.nextInt();
		System.out.print("Enter value of b : ");
		int b=sc.nextInt();
		System.out.print("Enter value of c : ");
		int c=sc.nextInt();
		//computing delta 
		double delta=Math.pow(b,2)+4*a*c;
		
		//method calling
		QuadraticEquation qe=new QuadraticEquation();
		double[]roots=qe.findRoots(a,b,c,delta);
		
		//printing result
		System.out.println("Roots are : ");
		for(int i=0;i<2;i++)
		{
			if(roots[i]!=0)
				System.out.print(roots[i]+" ");
		}
		//closing sc
		sc.close();
	}
}
			