import java.util.Scanner;

public class BasicCalculator {
    public static void addition(int number1,int number2){
        System.out.println(number1+"+"+number2+"="+(number1+number2));
    }
    public static void subtraction(int number1,int number2){
        System.out.println(number1+"-"+number2+"="+(number1-number2));

    }
    public static void multiplication(int number1,int number2){
        System.out.println(number1+"*"+number2+"="+(number1*number2));

    }public static void division(int number1,int number2){
        System.out.println(number1+"/"+number2+"="+(number1/number2));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("Select an operation (+,-,*,/) : ");
        String operation=sc.next();
        switch (operation){
            case "+":
                addition(number1,number2);
                break;
            case "-":
                subtraction(number1,number2);
                break;
            case "*":
                multiplication(number1,number2);
                break;
            case "/":
                division(number1,number2);
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}
