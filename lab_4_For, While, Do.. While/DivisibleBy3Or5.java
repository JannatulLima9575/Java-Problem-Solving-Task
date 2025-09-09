import java.util.Scanner;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;

        while (i <= N) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
