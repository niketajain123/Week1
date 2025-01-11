import java.util.Scanner;
public class FizzBuzzArray{
	public static void main(String[]args){
		//creating scanner object
		Scanner sc=new Scanner(System.in);
		//declaring a number variable
		int number;
		//taking input from user
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		if(number>0){
			String[]array=new String[number+1];
		//storing in array using for loop
		for(int i=0;i<=number;i++){
			if(i%5==0&&i%3==0){
				array[i]="FizzBuzz";
			}
			else if(i%5==0){
				array[i]="Buzz";				
			}
			else if(i%3==0){
				array[i]="Fizz";				
			}
			else{
				array[i]=String.valueOf(i);				
			}
		}
		//printing result
		
		for(int i=1;i<array.length;i++){
			System.out.println("Position "+(i)+"="+array[i]);
		}
		//closing sc object
		sc.close();
	}
	else
		System.out.println("Invalid input!");
}
}		