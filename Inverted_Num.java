public class Inverted_Num {
    public static void main(String[] args) {
        int n = 5, num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%-2d", num);
                num++;
            }
            System.out.println();
        }
    }
}