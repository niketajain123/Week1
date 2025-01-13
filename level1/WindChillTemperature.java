import java.util.Scanner;
public class WindChillTemperature{
	//defining method
	public double calculateWindChill(double temperature,double windSpeed){
		double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*windSpeed;
		return windChill;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.print("Enter temperature : ");
		double temperature=sc.nextDouble();
		System.out.print("Enter wind speed : ");
		double windSpeed=sc.nextDouble();
		//calling method
		WindChillTemperature wc=new WindChillTemperature();
		double windChill=wc.calculateWindChill(temperature,windSpeed);
		//printing result
		System.out.println("Wind Chill is "+windChill+" for temperature "+temperature+" and wind speed "+windSpeed);
		
		//closing sc
		sc.close();
		
	}
}
		