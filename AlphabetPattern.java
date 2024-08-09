public class AlphabetPattern {
 
    public static void main(String[] args) {
        
// S
//  A
//   R
//    A
//     V
//      A
//       N
//        A
//         N

// S
//  R
//   I
//    K
//     A
//      N
//       T
//        H
        // String[] Words =  { "SARAVANAN", "SRIKANTH"};

        // for( String word : Words) {

        //     for(int i = 0; i < word.length(); i++) {
        //         char currentChar = word.charAt(i);
        //         for(int j = 0; j < i; j++) {
        //             System.out.print(" ");
        //         }
        //         System.out.println(currentChar);
        //     }
        //     System.out.println();





        // String inputString = " HELLOW";

        // for( int i = 0; i < inputString.length(); i++) {
        //     for(int j = 0; j < inputString.length(); j++) {
        //         if(j <=i) System.out.print(inputString.charAt(j));
        //         else System.out.print(" ");
        //     }
        //     System.out.println();
        // }



        int n = 5;

        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j == 1 || i == 1 || i == n || i == n / 2 + 1) System.out.print("E ");
                else System.out.print(" ");
            }
            System.out.println();
        }
        }
    }

