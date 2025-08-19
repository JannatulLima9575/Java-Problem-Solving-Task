package Program;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);

	}

}
