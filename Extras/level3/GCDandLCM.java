import java.util.Scanner;

public class GCDandLCM {
    public static int calculateGCD(int number1,int number2){
        int min=Math.min(number1,number2);
        for(int i=number1;i>=1;i--){
            if(number1%i==0&&number2%i==0)
                return i;
        }
        return 1;
    }
    public static int calculateLCM(int number1,int number2){
        int gcd=calculateGCD(number1,number2);
        return number1*number2/gcd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("LCM is "+calculateLCM(number1,number2));
        System.out.println("GCD is "+calculateGCD(number1,number2));

    }
}
