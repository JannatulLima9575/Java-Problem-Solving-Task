import java.util.Scanner;

public class VotingSenior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            if (age >= 60) {
                System.out.println("Eligible to vote and also a senior citizen");
            } else {
                System.out.println("Eligible to vote but not a senior citizen");
            }
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
