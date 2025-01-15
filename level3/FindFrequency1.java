import java.util.Scanner;

public class FindFrequency1 {
    
    // find the frequency of characters
    public char[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; 
		for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
	int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
		}
		char[][] result = new char[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = (char) i;
                result[index][1] = (char) frequency[i];
                index++;
            }
        }
        return result;
    }

     public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method
		FindFrequency1 ff=new FindFrequency1();
        char[][] frequencies = ff.findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (char[] freq : frequencies) {
            System.out.println(freq[0] + " : " + (int) freq[1]);
        }
		//closing sc
        sc.close();
    }
}