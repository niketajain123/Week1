import java.util.Scanner;
public class EvenOddArrays{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		if(number<1)
			System.exit(0);
		//defining arrays
		int[]even=new int[number/2+1];
		int[]odd=new int[number/2+1];
		
		 int evenIndex=0,oddIndex=0;
		for(int i=1;i<=number;i++){
			if(i%2==0){
				even[evenIndex]=i;
				evenIndex++;
			}
			else{
			odd[oddIndex]=i;
			oddIndex++;
			}	
		}
			//printing
			System.out.println("Even array : ");
		for(int i=0;i<evenIndex;i++){
			System.out.print(even[i]+" ");
		}
		System.out.println();
			System.out.println("Odd array : ");
		for(int i=0;i<oddIndex;i++){
			System.out.print(odd[i]+" ");
		}
		
		//closing scanner object
		sc.close();
	}
}
		