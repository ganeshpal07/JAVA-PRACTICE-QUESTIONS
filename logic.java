import java.util.*;

public class logic {
    // Take three numbers and print the largest.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     // int a = sc.nextInt();
    //     // int b = sc.nextInt();
    //     // int c = sc.nextInt();

    //     // if (a > b && a > c) {
    //     //     System.out.println(a + " is the largest number.");
    //     // } else if (b > a && b > c) {
    //     //     System.out.println(b + " is the largest number.");
    //     // } else {
    //     //     System.out.println(c + " is the largest number.");
    //     // }

    //     // sc.close();

    // }






    // Check whether a number is divisible by both 5 and 11.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 5 == 0 && a % 11 == 0) {
            System.out.println("a is divisible by both 5 and 11");
        }  else {
            System.out.println("n is not divisible by both 5 and 11");
        }

        sc.close();


    }
}