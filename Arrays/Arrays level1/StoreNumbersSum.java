import java.util.Scanner;
class StoreNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while(true) {
            double n = sc.nextDouble();
            if(n <= 0 || index == 10) break;
            numbers[index++] = n;
        }
        for(int i = 0; i < index; i++) total += numbers[i];
        for(int i = 0; i < index; i++) System.out.println(numbers[i]);
        System.out.println("Total: " + total);
    }
}
