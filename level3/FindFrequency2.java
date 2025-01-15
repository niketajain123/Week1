import java.util.Scanner;

public class FindFrequency2 {

    //find unique characters in a string
    public char[] findUniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueChars.length(); j++) {
                if (uniqueChars.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }

         return uniqueChars.toString().toCharArray();
    }

    // find the frequency of unique characters in a string
    public String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
		char[] uniqueChars = findUniqueCharacters(text);
		String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); 
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); 
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        // method calling
		FindFrequency2 ff=new FindFrequency2();
        String[][] frequencies =ff.findCharacterFrequency(string);

        // Display the result
        System.out.println("Character frequencies:");
        for (String[] freq : frequencies) {
            System.out.println(freq[0] + " : " + freq[1]);
        }
		//closing sc
        sc.close();
    }
}