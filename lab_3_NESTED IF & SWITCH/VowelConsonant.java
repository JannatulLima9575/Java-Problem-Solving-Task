import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            if ("AEIOU".indexOf(ch) != -1) {
                System.out.println("Uppercase vowel");
            } else {
                System.out.println("Uppercase consonant");
            }
        } else {
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("Lowercase vowel");
            } else {
                System.out.println("Lowercase consonant");
            }
        }
    }
}
