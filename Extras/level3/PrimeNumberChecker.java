import java.util.Scanner;

public class PrimeNumberChecker {
    private static int number;
    public static void userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        number=sc.nextInt();
    }
    public static boolean checkPrime(){
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
    public static void display(){
        System.out.println("Number "+number+" is prime? "+checkPrime());
    }
    public static void main(String[] args) {
        userInput();
        checkPrime();
        display();
    }
}
