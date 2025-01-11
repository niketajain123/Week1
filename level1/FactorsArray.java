import java.util.Scanner;
public class FactorsArray{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//declaring variable
		int number,maxFactor=10,index=0;
		//taking input
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		//creating array
		int[]factors=new int[maxFactor];
		//finding factors===
		for(int i=1;i<=number;i++){
			if(number%i==0)
			{
			
				if(index==maxFactor)
				{
				maxFactor=maxFactor*2;
				int[]temp=new int[maxFactor];
				for(int j=0;j<index;j++){
					temp[j]=factors[j];
				}
				factors=temp;
				}
				factors[index]=i;
				index++;
			}
		}
		for(int i=0;i<index;i++){
			System.out.print(factors[i]+" ");
		}
		//closing sc
		sc.close();
	}
}
		
				