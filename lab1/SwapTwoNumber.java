package lab1;
import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

	        System.out.print("a = ");
	        int a = input.nextInt();
	        
	        System.out.print("b = ");
	        int b = input.nextInt();

	        int c = a;
	        a = b;
	        b = c;

	        System.out.println("a = " + a + ", b = " + b);

	}

}
