import java.util.Scanner;
public class GenerateRandomValue{
	 public int[] generate4DigitRandomArray(int size) {
		 int[]array=new int[size];
		 for(int i=0;i<size;i++){
      array[i]=(int)(Math.random() * 9000)+1000;
		 }
		 return array;
   }
   public double[] findAverageMinMax(int[]array){
	   double[]avgMinMax=new double[3];
	   int sum=0;
	   int min=array[0];
	   int max=array[0];
	   for(int i=0;i<array.length;i++){
		   sum+=array[i];
		   if(min>array[i])
			   min=array[i];
		   if(max<array[i])
			   max=array[i];
	   }
	   avgMinMax[0]=(double)sum/array.length;
	   avgMinMax[1]=min;
	   avgMinMax[2]=max;
	   return avgMinMax;
   }
   
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   //taking size input
	   System.out.println("Enter size : ");
	   int size=sc.nextInt();
	   //calling method
	   GenerateRandomValue gr=new GenerateRandomValue();
	   int[]random=gr.generate4DigitRandomArray(size);
	   double[]avgMinMax=gr.findAverageMinMax(random);
	   //printing result
	   System.out.println("Random values are : ");
	   for(int i=0;i<random.length;i++){
		   System.out.print(random[i]+" " );
	   }
	   System.out.println();
	   System.out.println("Their average is "+avgMinMax[0]+" minimum value is "+avgMinMax[1]+" maximum value is "+avgMinMax[2]);
	   //closing sc
	   sc.close();
   }
}