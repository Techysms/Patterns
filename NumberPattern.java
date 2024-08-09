import java.util.Scanner;

public class NumberPattern {
     static void Main(int n) {
        int i , j;

        for(i = 0 ; i < n ; i++) {
            for(j = 0; j < 2*i + 1; j++) {
                if((i + j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        for(i = 0; i < n; i++) {
            for(j = 0 ; j < 2*n- 2*i-1; j++) {
                if((i + j) % 2 == 0)  System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Main(t);
        scan.close();
    }
}
