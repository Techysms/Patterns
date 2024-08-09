public class Square {
    public static void main(String[] args) {
        int n = 5, i, j;

        for(i = 1; i <=n; i++) {
            int start = i;
            for(j = 1 ; j <= n; j++) {
                System.out.print(start + " ");
                start++;
                if(start > n) {
                    start = 1;
                }
            }
            System.out.println();
        }
    }
}
