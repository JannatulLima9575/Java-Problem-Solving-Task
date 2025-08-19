package lab1;
import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "C =" + fahrenheit +"F");

	}

}
