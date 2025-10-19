import java.util.*;
public class MultiplesBelow100___2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int i = 1;
            while (i < 100) {
                if (i % number == 0)
                    System.out.println(i);
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer less than 100");
        }
    }
}
