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

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int a = sc.nextInt();

    //     if(a % 5 == 0 && a % 11 == 0) {
    //         System.out.println("a is divisible by both 5 and 11");
    //     }  else {
    //         System.out.println("n is not divisible by both 5 and 11");
    //     }

    //     sc.close();


    // }

//     Take marks and print grade:
// 90–100 → A
// 80–89 → B
// 70–79 → C
// 60–69 → D
// below 60 → F


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("marks: ");
    //     int marks = sc.nextInt();

    //     if(marks <= 100 && marks >=90) {
    //         System.out.println("grade A");
    //     } else if (marks <= 89 && marks >= 80)  {
    //         System.out.println("grade B");
    //     } else if (marks <=79 && marks >= 70) {
    //         System.out.println("grade C");
    //     } else if (marks <= 69 && marks >= 60) {
    //         System.out.println("garde D");
    //     } else {
    //         System.out.println("failed");

    //     }


    //     sc.close();

    //     }

    // Create a simple calculator using +, -, *, /, %.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("num1: ");
    //     double num1 = sc.nextDouble();

    //     System.out.println("num2: ");
    //     double num2 = sc.nextDouble();

    //     System.out.print("choose operator +, -, *, /, % : ");
    //     String operator = sc.next();

    //     if (operator.equals("+")) {
    //         System.out.println("result =" + (num1 + num2));
    //     } else if (operator.equals("-")) {
    //         System.out.println("result =" + (num1 - num2));
    //     } else if (operator.equals("*")) {
    //         System.out.println("result =" + (num1*num2));
    //     } else if (operator.equals("/")) {
    //         System.out.println("result =" + (num1/num2));
    //     } else if (operator.equals("%")) {
    //         System.out.println("result =" + (num1%num2));
    //     } else{
    //         System.out.println("invalid operator");
    //     }

    //     sc.close();
    //     }




    // Check whether a year is a leap year.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //      System.out.println("enter year: ");
    //      int year = sc.nextInt();

    //     if (year %  4 == 0 || year % 400 == 0) {
    //         System.out.println("this is a leap year");
    //     } else {
    //         System.out.println("not a leap year");
    //     }
    //     sc.close();

    // }


    // Given a number from 1–7, print the corresponding day of the week.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num) {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("Sunday");
            // break;
            default : System.out.println("ivalid");
            sc.close();
        }

    }
}
    







