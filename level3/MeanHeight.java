import java.util.Scanner;
public class MeanHeight{
	public static int[] generateHeights(){
		int[]height=new int[11];
		for(int i=0;i<11;i++){
			height[i]=(int)(Math.random()*100+150);
		}
		return height;
	}
	public int sumOfHeights(int[]height){
		int sum=0;
		for(int i=0;i<height.length;i++){
			sum+=height[i];
		}
		return sum;
	}
	public int meanOfHeights(int[]height){
		int mean=sumOfHeights(height)/height.length;
		return mean;
	}
	public int shortestHeight(int[]height){
		int shortest=height[0];
		for(int i=0;i<height.length;i++){
			if(shortest>height[i])
				shortest=height[i];
		}
		return shortest;
	}
	public int tallestHeight(int[]height){
		int tallest=height[0];
		for(int i=0;i<height.length;i++){
			if(tallest<height[i])
				tallest=height[i];
		}
		return tallest;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		MeanHeight mh=new MeanHeight();
		
		int[]height=mh.generateHeights();
		
		//printing result
		System.out.println("Sum of all heights is "+mh.sumOfHeights(height));
		System.out.println("Mean height is "+mh.meanOfHeights(height));
		System.out.println("Shortest heights is "+mh.shortestHeight(height));
		System.out.println("Tallest heights is "+mh.tallestHeight(height));
		//closing sc
		sc.close();
	}
}
	
	
		
	
	
	
	