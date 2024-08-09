import java.util.Scanner ;

public class DiamondWithNumber {
    
    public static void Main(int n) {
        for(int i = 0 ; i< n ; i++) {
            for(int j = 0; j < 2*i + 1; j++) {
                if(j % 2 != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--) {
            for(int j = i; j < 2*n - 2*i - 1; j++) {
                if(j % 2 != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Main(num);
        scan.close();
    }
}