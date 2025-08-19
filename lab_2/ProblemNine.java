package lab_2;

import java.util.Scanner;

public class ProblemNine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter an integer: ");
	        int number = input.nextInt();

	        if (number % 5 == 0 && number % 11 == 0) {
	            System.out.println(number + " is divisible by both 5 and 11");
	        } else {
	            System.out.println(number + " is not divisible by both 5 and 11");
	        }

	}

}
