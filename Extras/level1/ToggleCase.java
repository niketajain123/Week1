package level1.out.production.Extras;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c>='A'&&c<='Z') {
                // Convert to lowercase
                result += (char)(c+32);
            } else if (c>='a'&&c<='z') {
                // Convert to uppercase
                result += (char)(c-32);
            } else {
                // Non-alphabetic characters remain unchanged
                result += c;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Toggle the case of each character
        String result = toggleCase(input);

        // Output the result
        System.out.println("String with toggled case: " + result);

        sc.close();
    }
}

