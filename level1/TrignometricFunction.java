import java.util.Scanner;
public class TrignometricFunction{
	//defining method
	public double[] calculateTrignometricFunctions(double angle){
		double[]answers =new double[3];
		answers[0]=Math.sin(angle);      //sine
		answers[1]=Math.cos(angle);    //cosine
		answers[2]=Math.tan(angle);   //tangent
		return answers;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter an angle : ");
		double angle=sc.nextDouble();
		//calling method
		TrignometricFunction tf=new TrignometricFunction();
		double []answers=tf.calculateTrignometricFunctions(angle);
		//printing result
		System.out.println("sine"+angle+" => "+answers[0]);
		System.out.println("cosine"+angle+" => "+answers[1]);
		System.out.println("tangent"+angle+" => "+answers[2]);		
		//closing sc
		sc.close();
		
	}
}
		