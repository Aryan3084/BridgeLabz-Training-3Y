import java.util.*;
public class FriendsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int heightAmar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        int heightAnthony = sc.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar)
            System.out.println("Youngest: Amar");
        else if (youngestAge == ageAkbar)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar)
            System.out.println("Tallest: Amar");
        else if (tallestHeight == heightAkbar)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}
