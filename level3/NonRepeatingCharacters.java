import java.util.Scanner;

public class NonRepeatingCharacters {

    // find the first non-repeating character
    public char findFirstNonRepeatingChar(String str) {
        int[] frequency = new int[256];
		for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }
		for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0';
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
		NonRepeatingCharacters rc=new NonRepeatingCharacters();
         char result =rc.findFirstNonRepeatingChar(string);

        // Printing the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
		//closing sc
        sc.close();
    }
}
