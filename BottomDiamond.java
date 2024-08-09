import java.util.Scanner;

class Pattern8 {
    static void Main(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*n - (2*i + 1); j++) {
                System.out.print("* ");
            } 

            for(int j=0; j<i; j++) {
                System.out.print(" ");
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