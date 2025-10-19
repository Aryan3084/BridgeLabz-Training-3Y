import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter character to remove: ");
        char removeChar = input.next().charAt(0);

        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != removeChar) result += ch;
        }

        System.out.println("Modified String: " + result);
    }
}
