package Program;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int num1 = input.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = input.nextInt();

	        System.out.println("Sum = " + (num1 + num2));
	        System.out.println("Multiplication = " + (num1 * num2));
	        System.out.println("Subtraction = " + (num1 - num2));
	        System.out.println("Division = " + (num1 / num2));

	}

}
