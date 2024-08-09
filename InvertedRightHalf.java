import java.util.Scanner;

class InvertedRightHalf {
    static void Main(int n){
        for(int i=n; i>0; i--) {
            for(int j=0; j<i; j++) {
                System.out.print("* ");
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