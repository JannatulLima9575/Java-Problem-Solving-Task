package lab1;
import java.util.Scanner;


public class AreaofCircle {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area = " + area);

	}

}
