package Program;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Department: ");
        String dept = input.nextLine();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);

	}

}
