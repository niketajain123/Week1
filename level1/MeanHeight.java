import java.util.Scanner;
public class MeanHeight{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		
		//defining array of 11 for 11 players height
		double[]height=new double[11];
		//taking user input in height 
		for(int i=0;i<height.length;i++){
		System.out.println("Enter height of player"+(i+1)+" : ");
		height[i]=sc.nextDouble();
		}
		double sum=0;
		for(int i=0;i<height.length;i++){
			sum+=height[i];
		}
		double meanHeight=sum/11;
		System.out.println("Mean height of football team is "+meanHeight);
		//closing scanner object
		sc.close();
	}
}