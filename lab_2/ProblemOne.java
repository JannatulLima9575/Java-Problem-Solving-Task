package lab_2;

import java.util.Scanner;

public class ProblemOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

	}

}
