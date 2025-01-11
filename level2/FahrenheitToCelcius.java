import java.util.Scanner;
public class FahrenheitToCelcius{
	public static void main(String[]args){
		//declaring variables
		double celcius;
		int fahrenheit;
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter temperature in fahrenheit : ");
		fahrenheit=sc.nextInt();
		//converting fahrenheit into celcius
		celcius=(double)(fahrenheit-32)*5/9;
		//printing results
		System.out.println("The "+fahrenheit+" fahrenheit is +"+celcius+" celcius");
	}
}
