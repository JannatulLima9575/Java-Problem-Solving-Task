import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Zero is neither even nor odd");
        } else {
            switch (num % 2) {
                case 0:
                    if (num > 0)
                        System.out.println("even and positive");
                    else
                        System.out.println("even and negative");
                    break;
                case 1:
                case -1: // handles negative odd
                    if (num > 0)
                        System.out.println("odd and positive");
                    else
                        System.out.println("odd and negative");
                    break;
            }
        }
    }
}
