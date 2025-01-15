import java.util.Scanner;
public class IsPalindrome {

    // Logic 1: Iterative method
    public boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reversing
    public boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];
		for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }
		for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("Enter String");
		String string =sc.next();

        System.out.println("Input string: " + string);
		IsPalindrome ip=new IsPalindrome();
        //Logic 1
        boolean resultIterative = ip.isPalindromeIterative(string);
        System.out.println("Is palindrome (Iterative): " + resultIterative);

        //Logic 2
        boolean resultRecursive =ip.isPalindromeRecursive(string, 0, string.length() - 1);
        System.out.println("Is palindrome (Recursive): " + resultRecursive);

        //Logic 3
        boolean resultCharArray =ip.isPalindromeUsingCharArray(string);
        System.out.println("Is palindrome (Using Character Array): " + resultCharArray);
		//closing sc
		sc.close();
		
    }
}
