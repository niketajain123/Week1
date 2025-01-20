package level1.out.production.Extras;

import java.util.Scanner;

public class LexicographicalComparison {
    // Method to compare two strings lexicographically
    public static int compareStringsLexicographically(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return -1;
            } else if (char1 > char2) {
                return 1;
            }
        }
        //compare based on length
        if (len1 < len2) {
            // str1 is lexicographically smaller because it is shorter
            return -1;
        } else if (len1 > len2) {
            // str2 is lexicographically smaller because it is shorter
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input to the two strings to compare
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Compare the two strings lexicographically
        int result = compareStringsLexicographically(str1, str2);

        // Output the comparison result
        if (result < 0) {
            System.out.println("The first string is lexicographically smaller.");
        } else if (result > 0) {
            System.out.println("The second string is lexicographically smaller.");
        } else {
            System.out.println("Both strings are equal.");
        }

        sc.close();
    }
}
