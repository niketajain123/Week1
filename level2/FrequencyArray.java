import java.util.Scanner;
public class FrequencyArray{
	public static void main(String[]args){
		//declaring variables and taking input
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		int temp=number;
		//counting digits
		int count=0;
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		//storing digits
		int[]digits=new int[count];
		temp=number;
		int x=0;
		while(temp!=0){
			digits[x]=temp%10;
			x++;
			temp=temp/10;
		}
		//computing frequency
		int []frequency=new int[10];
		int f=0;
		for(int i=0;i<count;i++){
			f=0;
			for(int j=0;j<count;j++){
				if(digits[i]==digits[j])
					f++;
			}
			frequency[i]=f;
		}
		//printing result
		for(int i=0;i<count;i++){
			System.out.println("Frequency of "+digits[i]+" is "+frequency[i]);
		}
		//closing scanner
		sc.close();
	}
}