import java.util.*;

// Take the side of a square and calculate its area and perimeter.
public class Level1 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the side of the square: ");
    //     double side = sc.nextDouble();  
    //     // we use double here because the side of a square can be a decimal value.
    //     double area = side*side;
    //     double perimeter = 4*side;

    //     System.out.println("area:" + area);
    //     System.out.println("perimeter:" + perimeter);
    //     sc.close();

    //     // we use + here to concatenate the string and the value of area and perimeter.
    // }

    //   Take marks of 3 subjects and calculate total and percentage.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mark 1:");
        double mark1 = sc.nextDouble();

        System.out.println("marks2: ");
        double mark2 = sc.nextDouble();

        System.out.println("mark3: ");
        double mark3 = sc.nextDouble();

        System.out.println("total marks: " + (mark1 + mark2 + mark3));
        System.out.println("percentage: " + ((mark1 + mark2 + mark3) / 3));

        sc.close();


    }
   
           
       
}