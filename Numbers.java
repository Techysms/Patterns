import java.util.Scanner;

public class Numbers {

    static void Main(int n) {
        int i, j, nums = 1;
        
        for(i = 0; i < n; i++) {
            for(j = 0; j <=i; j++) {
                System.out.print(nums + " ");
                nums++;
            }
            System.out.println();
        }
    }

    static void Main1(int n) {
        int i, j, nums = 1;
        
        for(i = 0; i < n; i++) {
            for(j = 0; j <=i; j++) {
                System.out.print(nums + " ");
                
            }
            System.out.println();
            nums++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Main(t);
        System.out.println("----------------------------");
        Main1(t);
        scan.close();
    }
}
