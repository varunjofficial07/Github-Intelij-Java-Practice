package javadsa.patterns;

public class SymmetricVoid {
    public static void main(String[] args) {
        int n = 5


                ;

        // Upper half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
