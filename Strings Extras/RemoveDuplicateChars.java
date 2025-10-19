import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) result += ch;
        }

        System.out.println("Modified String: " + result);
    }
}
