import java.util.Scanner;

public class AnagramChecking {

    //check if the texts are in the anagram form
    public boolean anagramsCheck(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
		text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();
        int[] freq1 = new int[256]; 
        int[] freq2 = new int[256]; 
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String string1 = sc.nextLine();

        System.out.println("Enter the second text:");
        String string2 = sc.nextLine();
		AnagramChecking an=new AnagramChecking();
        boolean result = an.anagramsCheck(string1, string2);

        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }
		//closing sc
        sc.close();
    }
}