import java.util.Scanner;

public class SumOddWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1, sum = 0;

        while (i <= N) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
