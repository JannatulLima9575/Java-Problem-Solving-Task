package lab1;

import java.util.Scanner;

public class SquareAndCube {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number to find square and cube: ");
	        int a = input.nextInt();

	        System.out.println("Square = " + (a * a));
	        System.out.println("Cube = " + (a * a * a));

	}

}
