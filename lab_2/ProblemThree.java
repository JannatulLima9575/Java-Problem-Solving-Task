package lab_2;

import java.util.Scanner;

public class ProblemThree {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is larger number");
        } 
        else if (num2 > num1) {
            System.out.println(num2 + " is larger number");1
        } else {
            System.out.println("Both numbers are equal");
        }
	}

}
