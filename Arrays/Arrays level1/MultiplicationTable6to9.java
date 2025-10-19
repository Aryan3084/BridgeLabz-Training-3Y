import java.util.Scanner;
class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] result = new int[4];
        for(int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            result[i] = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + result[i]);
        }
    }
}
