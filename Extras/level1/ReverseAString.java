package level1.out.production.Extras;

import java.util.Scanner;

public class ReverseAString {
    public static String stringReverse(String str){
        String reverse = "";
        for(int i=str.length()-1 ;i>=0;i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str =sc.nextLine();
        String reversedString =stringReverse(str);
        System.out.println("The Reversed String Is: "+reversedString);
    }
}
