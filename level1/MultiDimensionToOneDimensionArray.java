import java.util.Scanner;
public class MultiDimensionToOneDimensionArray{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variables
		int rows,columns;
		//2-D array
		System.out.println("Enter number of rows and columns : ");
		rows=sc.nextInt();
		columns=sc.nextInt();
		int[][]TwoDArray=new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print("Enter elemennt["+i+"]["+j+"] : ");
				TwoDArray[i][j]=sc.nextInt();
			}
		}
		int index=0;
		int[]OneDArray=new int[rows*columns];
		//copying
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				OneDArray[index]=TwoDArray[i][j];
				index++;
			}
		}
		//printing one dimension array
		for(int i=0;i<index;i++){
		System.out.print(OneDArray[i]+" ");
		}
		//closing sc
		sc.close();
	}
}

		