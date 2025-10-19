import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;

        char mostFreq = ' ';
        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                mostFreq = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreq + "'");
    }
}
