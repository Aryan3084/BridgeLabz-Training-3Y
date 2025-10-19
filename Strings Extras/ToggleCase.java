import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String toggled = "";
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) toggled += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) toggled += Character.toUpperCase(ch);
            else toggled += ch;
        }

        System.out.println("Toggled String: " + toggled);
    }
}
