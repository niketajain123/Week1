package level1.out.production.Extras;

import java.util.Scanner;

public class CountSubstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string and the substring
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();

        // Initialize the count and index
        int count = 0;
        int index = str.indexOf(substring);

        // Count occurrences of the substring
        while (index != -1) {
            count++;
            index = str.indexOf(substring, index + substring.length());
        }

        // Output the count
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times.");

        sc.close();
    }
}
