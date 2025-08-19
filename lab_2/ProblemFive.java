package lab_2;

import java.util.Scanner;

public class ProblemFive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char alphabet = input.next().toLowerCase().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + " is a vowel");
        } else {
            System.out.println(alphabet + " is not a vowel");
        }

	}

}
