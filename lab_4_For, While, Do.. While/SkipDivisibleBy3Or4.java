public class SkipDivisibleBy3Or4 {
    public static void main(String[] args) {
        int i = 15;

        while (i >= 1) {
            if (i % 3 == 0 || i % 4 == 0) {
                i--;
                continue;
            }
            System.out.print(i + " ");
            i--;
        }
    }
}
