
//Diamond pattern
import java.util.*;

public class pattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Upper part
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for(int i = n - 1; i >= 1; i--) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}