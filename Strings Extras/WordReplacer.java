import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();
        System.out.print("Enter new word: ");
        String newWord = input.nextLine();

        String modified = sentence.replaceAll(oldWord, newWord);
        System.out.println("Modified Sentence: " + modified);
    }
}
