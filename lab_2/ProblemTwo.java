package lab_2;

import java.util.Scanner;

public class ProblemTwo {

	public static void main(String[] args) {
		
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int number = input.nextInt();

		        if (number % 2 == 0) {
		            System.out.println("Even number");
		        } else {
		            System.out.println("Odd number");
		        }	
	}

}
