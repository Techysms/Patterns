import java.util.Scanner;

class HollowSqaure {
    static void Main(int n) {
        for(int i=0; i< n; i++) {
            for(int j=0; j< n; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1) System.out.print("*");
                else System.out.print(" ");
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