import java.util.Scanner;

public class ReplaceWordWithAnother {
        public static String replace(String sentence, String target, String replacement) {
            if (sentence == null || target == null || replacement == null) {
                throw new IllegalArgumentException("Arguments cannot be null");
            }
            return sentence.replace(target, replacement);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence : ");
        String sentence = sc.nextLine();
        System.out.println("Enter Target word : ");
        String target = sc.nextLine();
        System.out.println("Enter Replacement word : ");
        String replacement = sc.nextLine();

        String afterReplacement = replace(sentence,target,replacement);
        System.out.println("Before replacement : "+ sentence);
        System.out.println("After replacement : "+ afterReplacement);
    }
}
