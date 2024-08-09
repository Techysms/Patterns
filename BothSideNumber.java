import java.util.Scanner;

class BothSideNumber {
    static void Main(int n) {
        int spaces = 2*n - 2, i, j;

        for( i = 1; i<=n ; i++) {
            for(j = 1; j<=i; j++) {
                System.out.print(j);
            }
            for(j = 1; j<=spaces; j++) {
                System.out.print(" ");
            }
            for( j = i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -=2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int k=0; k<t; k++) {
            int y;
            y = scanner.nextInt();
            Main(y);
        }
        scanner.close();
    }
}