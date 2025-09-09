import java.util.Scanner;

public class EvenWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;

        while (i <= N) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
