package Program;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find square and cube: ");
        int num = input.nextInt();

        System.out.println("Square = " + (num * num));
        System.out.println("Cube = " + (num * num * num));

	}

}
