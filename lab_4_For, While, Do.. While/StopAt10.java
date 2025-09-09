public class StopAt10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
            if (i == 10) {
                break;
            }
        }
    }
}
