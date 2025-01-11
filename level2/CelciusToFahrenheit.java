import java.util.Scanner;
public class CelciusToFahrenheit{
	public static void main(String[]args){
		//declaring variables
		int celcius;
		double fahrenheit;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter temperature in celcius : ");
		celcius=sc.nextInt();
		//converting celcius into fahrenheit
		fahrenheit=(double)celcius*9/5+32;
		//printing results
		System.out.println("The "+celcius+" celsius is "+fahrenheit+" fahrenheit");
	}
}
