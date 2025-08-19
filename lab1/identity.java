package lab1;
import java.util.Scanner;

public class identity {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Name: ");
        String name = input.nextLine();
        
        System.out.print("Department: ");
        String department = input.nextLine();

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);

	}

}
