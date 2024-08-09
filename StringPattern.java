import java.util.Scanner;

public class StringPattern {
    
    public static void Main(String t) {

        int i, j, n= t.length(), x = -(1 - n); // x = n - 1

        for( i = 0; i < n; i++) {
            for( j = 0 ; j < n; j++) {
                
                if(i == j) System.out.print(t.charAt(i));
                else if(x == j) System.out.print(t.charAt(j));
                else System.out.print(" ");
            }
            x--;
            System.out.println();
        }
    }

    public static void Main1(String t) {
        int i , j = 0, n = t.length();

        for( i = 0; i < n; i++) {
            for( j = 0 ; j <= n / 2; j++) {
                if(i == n / 2) {
                    System.out.print(t);
                    break;
                } else {
                    if(j == n / 2)
                        System.out.print(t.charAt(i));
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String t = scan.next();
        Main(t);
        System.out.println("-------------------");
        Main1(t);
        scan.close();
    }
}