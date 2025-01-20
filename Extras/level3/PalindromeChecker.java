import java.util.Scanner;

public class PalindromeChecker {
    public static String userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String text=sc.next();
        return text;
    }
    public static boolean checkPalindrome(String text){
        int start=0;
        int end=text.length()-1;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void display(String text){
        System.out.println("String \""+text+"\" is palindrome? "+checkPalindrome(text));
    }

    public static void main(String[] args) {
       String text= userInput();
        checkPalindrome(text);
        display(text);
    }
}
