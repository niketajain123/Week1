import java.util.Scanner;

public class FindFrequency3{

    // find the frequency of characters
    public String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); 
        int[] frequency = new int[characters.length]; 
        boolean[] isCounted = new boolean[characters.length];
		for (int i = 0; i < characters.length; i++) {
            if (isCounted[i]) continue; 
            frequency[i] = 1;
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    isCounted[j] = true; 
                }
            }
        }
		int uniqueCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (!isCounted[i]) {
                uniqueCount++;
            }
        }
		String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (!isCounted[i]) {
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
		FindFrequency3 ff=new FindFrequency3();
		String[] frequencies =ff.findCharacterFrequency(string);

        // Display the result
        System.out.println("Character frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }
		//closing sc
        sc.close();
    }
}