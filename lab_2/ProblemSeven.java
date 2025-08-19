package lab_2;

import java.util.Scanner;

public class ProblemSeven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = input.nextInt();

        if (marks >= 80) {
            System.out.println("Grade A");
        } 
        else if (marks >= 60) {
            System.out.println("Grade B");
        } 
        else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
        
	}

}
