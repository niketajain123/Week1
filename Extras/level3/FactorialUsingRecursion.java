import java.util.Scanner;

public class FactorialUsingRecursion {
    public static int factorial(int number){
        if(number==1||number==0)
            return 1;
        return number*factorial(number-1);

    }
    public static void display(int number){
        System.out.println("Factorial of "+number+" is "+factorial(number));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=sc.nextInt();
        display(number);

    }
}
