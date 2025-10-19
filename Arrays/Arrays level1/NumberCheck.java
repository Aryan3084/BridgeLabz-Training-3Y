import java.util.Scanner;
class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++) numbers[i] = sc.nextInt();
        for(int n : numbers) {
            if(n > 0) System.out.println(n % 2 == 0 ? n + " is positive even" : n + " is positive odd");
            else if(n < 0) System.out.println(n + " is negative");
            else System.out.println(n + " is zero");
        }
        if(numbers[0] == numbers[4]) System.out.println("First and last are equal");
        else if(numbers[0] > numbers[4]) System.out.println("First is greater than last");
        else System.out.println("First is less than last");
    }
}
