import java.util.Scanner;

public class UniqueCharacters {

    //calculate the length of a string
    public int findLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
           System.out.println("IndexOutOfBoundsException is generated");
        }
        return length;
    }

    //find unique characters in a string
    public char[] findUniqueCharacters(String str) {
        int length = findLength(str); 
        char[] unique = new char[length]; 
        int uniqueIndex = 0; 

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
		for (int j = 0; j < uniqueIndex; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
		if (isUnique) {
                unique[uniqueIndex++] = currentChar;
            }
        }
		char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//taking input
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        UniqueCharacters uc=new UniqueCharacters();
        char[] uniqueChars = uc.findUniqueCharacters(string);

       
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
		//closing sc
        sc.close();
    }
}
