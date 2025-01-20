import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void displayFibonacci(int number){
        int a=0;
        int b=1;
        int c=a+b;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1;i<=number-2;i++){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
           }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sequence : ");
        int number=sc.nextInt();
        displayFibonacci(number);
    }
}
