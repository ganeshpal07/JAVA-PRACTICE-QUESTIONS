//  patterns in java are mainly based on nested loops
import java.util.*;

// printing "a rectangle using users input"

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    //  explanation for this code
    // i decide karta hai ki kaunsi row chal rahi hai.
    // j decide karta hai ki current row mein kaunsa star print ho raha hai.
    // outer loop: i ko 1 se start karo, jab tak i <= n hai loop chalao, aur har round ke baad i++ karo.
    // system.out,println: Jab inner loop complete ho jaata hai, ye cursor ko next line mein le jaata hai.
}
