import java.util.Scanner;
public class TrimSpaces {

    // Method to trim
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main function
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String string=sc.nextLine();
        // Trim spaces using user-defined methods
        int[] trimIndices = trimSpaces(string);
        String trimmedString = createSubstring(string, trimIndices[0], trimIndices[1]);

        // Trim spaces using built-in trim() method
        String builtInTrimmed = string.trim();

        // Compare the results
        boolean areEqual = compareStrings(trimmedString, builtInTrimmed);

        // Display the results
        System.out.println("User-defined Trimmed String \t: " + trimmedString );
        System.out.println("Built-in Trimmed Stringt \t: " + builtInTrimmed );
        System.out.println("Are the strings equal? " + areEqual);
		//closing sc
		sc.close();
    }
}