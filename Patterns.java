import java.util.Scanner;

public class Patterns {

    public static void Main(int t) {
        int i , j;

        for(i = t; i>=1; i--) {
            for(j = 1; j<i; j++) {
                System.out.print(" ");
            }
            if(i % 2 == 0) System.out.print("*");
            else System.out.print("**");
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
