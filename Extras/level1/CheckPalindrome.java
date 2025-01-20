package level1.out.production.Extras;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome= false;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str =sc.nextLine();
        boolean palindrome =isPalindrome(str);
        System.out.println("Is the String Is Palindrome!?: "+palindrome);
    }
}
