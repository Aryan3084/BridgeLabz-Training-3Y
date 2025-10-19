import java.util.*;
public class PowerCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (number >= 0 && power >= 0) {
            long result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        } else {
            System.out.println("The number and power must be positive integers");
        }
    }
}
