import java.util.*;

public class Practice {
   /*
   Reverse a number
Input 12345 → Output 54321 */

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int reverse = 0;
//     System.out.println("Enter any number:");
//     int number = sc.nextInt();

//     while(number>0) {
//         int lastDigit = number%10;
//         number = number/10;
//         reverse = reverse*10 + lastDigit;
//     }
//     System.out.println("Reversed number is:" +reverse);
//     sc.close();


// }

// print first digit of a number:


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();
//     int digit = 0;
//     // digit ek variable initialize kia h jiski staring value 0 h.

//     while(number>0) {
//         // jab tak number 0 se bada hoga tab tak loop chalegaa.
//         digit = number;
//         // number ki current value ki copy digit m store ho jaaegi.
//         number = number/10;
//         /* iss loop m number jab tak 0 se bada hoga 
//         tab tak vo 10 se divide hota rahegga; jaise hi condition false
//         hogi loop band ho jaaega */
//     }
//     System.out.println("FirstDigit is :" + digit);
//     sc.close();
// }


// print last digit of a number;

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();
//     int lastdigit = number%10;

//     if(number>0) {
//         System.out.println("Last Digit is :" +lastdigit);
//     } else {
//         System.out.println("invalid");
//     }
//     sc.close();
// }


// print the sum of first and last digit

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    
    if(number>0) {
        int firstdigit = 0;
        int lastdigit = number%10;
    
        while(number>0) {
            firstdigit = number;
            number = number/10;
            
        }
        int sum = lastdigit + firstdigit;

        System.out.println("FirstDigit =" +firstdigit);
        System.out.println("LastDigit =" +lastdigit);
        System.out.println("sum is:" +sum);

    } else {
        System.out.println("invalid");
    }
    sc.close();
}
    
}
