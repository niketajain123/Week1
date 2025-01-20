import java.util.Scanner;

public class TemperatureConverter {
    public static double celciusToFahrenheit(int celcius){
        return celcius*9/5.0+32;
    }
    public static double fahrenheitToCelcius(int fahrenheit){
        return (fahrenheit-32)*5/9.0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celcius : ");
        int celcius=sc.nextInt();
        System.out.println("Temperature in fahrenheit is : "+celciusToFahrenheit(celcius));
        System.out.println("Enter temperature in fahrenheit : ");
        int fahrenheit=sc.nextInt();
        System.out.println("Temperature in celcius is : "+fahrenheitToCelcius(fahrenheit));

    }
}
