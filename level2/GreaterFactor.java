import java.util.Scanner;
public class GreaterFactor{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring variable
		int number,greaterFactor;
		//taking input from user
		System.out.println("Enter number : ");
		number=sc.nextInt();
		greaterFactor=1;
		
		//checking greaterFactor
		for(int i=1;i<number;i++){
			if(number%i==0)
				greaterFactor=i;
		}
		//printing result
		System.out.println("Greater Factor of "+number+" is "+greaterFactor);
		
		
		//closing sc object
		sc.close();
	}
}
		