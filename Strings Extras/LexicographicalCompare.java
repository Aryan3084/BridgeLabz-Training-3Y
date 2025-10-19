import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();

        int minLen = Math.min(str1.length(), str2.length());
        int result = 0;
        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if (result == 0) result = str1.length() - str2.length();

        if (result < 0) System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        else if (result > 0) System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
        else System.out.println("Both strings are equal");
    }
}
