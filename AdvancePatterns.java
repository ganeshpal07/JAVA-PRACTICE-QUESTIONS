/*
1
121
12321
1234321
123454321 print the pattern or take user input.
*/

import java.util.*;

public class AdvancePatterns{
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     for(int i=1; i<=n; i++) {
    //         // increasing part
    //         for(int j=1; j<=i; j++) {
    //             System.out.print(j);
    //         }
    //         // decreasing part
    //         for(int k=i-1; k>=1; k--) {
    //             System.out.print(k);
    //         }
    //         System.out.println();
    //         sc.close();

    //     }
    // }


    /*
    5
    545
    54345
    5432345
    543212345 perform */

    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     for(int i=n; i>=1; i--) {
    //         // decreasing part
    //         for(int j=5; j>=i; j--) {
    //             System.out.print(j);
    //         }
    //         // increasing part
    //         for(int k=i+1; k<=5; k++) {
    //             System.out.print(k);
    //         }
    //         System.out.println();
    //         sc.close();

    //     }
    // }



    /*
    1
    212
    32123
    4321234
    543212345 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            // decreasing
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            // increasing
            for(int k=2; k<=i; k++) {
                System.out.print(k);
            }
            System.out.println();
            sc.close();
        }
    }

    
}