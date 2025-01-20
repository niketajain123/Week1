package level1.out.production.Extras;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String string){
        char str[] = string.toCharArray();
        int index = 0;

        // Traversing character array
        for (int i = 0; i < str.length; i++) {
            // Check whether str[i] is present before or not
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            // If the character is not present before, add it to resulting string
            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String str =sc.nextLine();
        String modifiedString=removeDuplicates(str);
        System.out.println("Modified String is :"+modifiedString);
    }
}
