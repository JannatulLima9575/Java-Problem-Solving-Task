import java.util.Scanner;

public class OddDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;

        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= N);
    }
}
