// Print numbers from 100 to 1.

public class Loops {
    // public static void main(String[] args) {
    //     for( int i = 10; i>=1; i--) {
    //         System.out.println(i);
    //     }

        
    // }

    // Print all even numbers from 1 to 100.

    // public static void main(String[] args) {
    //     for(int i = 1; i<=100; i++) {
    //         if(i%2==0) {
    //             System.out.println(i);
    //         } 
    //     }

    // }

    // Print the sum of numbers from 1 to n.

    // public static void main(String[] args) {
    //     int n = 15;
    //     int sum = 0;
    //     for(int i = 1; i<=n; i++) {
            // sum = sum + i;
                  // Purane sum mein current i ko add karke, result ko wapas sum mein store karo.
    //     }
    //     System.out.println(sum);
    // }

    // Print the sum of all even numbers from 1 to n.

    public static void main(String[] args) {

    int n = 10;
    int sum = 0;

    for(int i = 1; i <= n; i++) {
        if(i % 2 == 0) {
            sum = sum + i;
        }
    }

    System.out.println(sum);
}
    
}
