import java.util.*;

public class Practice {
   /*
   Reverse a number
Input 12345 → Output 54321 */

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int reverse = 0;
    System.out.println("Enter any number:");
    int number = sc.nextInt();

    while(number>0) {
        int lastDigit = number%10;
        number = number/10;
        reverse = reverse*10 + lastDigit;
    }
    System.out.println("Reversed number is:" +reverse);
    sc.close();


}
    
}
