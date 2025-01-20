import java.util.Scanner;

public class MaximumOfThreeNumbers {
    private static int firstNumber;
    private static int secondNumber;
    private static int thirdNumber;
    public static void userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        firstNumber=sc.nextInt();
        System.out.print("Enter second number : ");
        secondNumber= sc.nextInt();
        System.out.print("Enter third number : ");
        thirdNumber= sc.nextInt();
    }
    public static int checkMaximum(){
        if(firstNumber>secondNumber&&firstNumber>thirdNumber)
            return firstNumber;
        else if(secondNumber>firstNumber&&secondNumber>thirdNumber)
            return secondNumber;
        else
            return thirdNumber;
    }

    public static void main(String[] args) {
        userInput();
        System.out.println("Maximum among three numbers is :"+checkMaximum());
    }
}
