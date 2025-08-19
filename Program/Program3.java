package Program;
import java.util.Scanner;

public class Program3 {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int a = input.nextInt();
        System.out.print("Second number: ");
        int b = input.nextInt();
        System.out.print("Third number: ");
        int c = input.nextInt();
        System.out.print("Fourth number: ");
        int d = input.nextInt();

        int sum = a + b + c + d;
        int multiplication = a * b * c * d;

        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + multiplication);

	}

}
