import java.util.Scanner;

class RightHalfNumber {
    static void Main(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
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
        }
        scanner.close();
    }
}