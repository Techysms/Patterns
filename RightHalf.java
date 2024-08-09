import java.util.Scanner;

class RightHalf {
    static void Main(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Main1(int n) {
        int i, j , stars;
        for( i= 1; i<= 2*n-1; i++) {
            stars = i;
            if( i > n) stars = 2*n - i;
            for( j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int k=0; k<t; k++) {
            int y;
            y = scanner.nextInt();
            Main(y);
            System.out.println("-------------------------------");
            Main1(y);
        }
        scanner.close();
    }
}