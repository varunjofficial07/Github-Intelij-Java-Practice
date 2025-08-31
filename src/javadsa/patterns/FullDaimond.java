package javadsa.patterns;

public class FullDaimond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n ; i++) {
            System.out.println(" ".repeat(n - i -1) + "*".repeat(2 * i + 1)+ " ".repeat(n - i -1));
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(" ".repeat(i) + "*".repeat(2 * (n - i) - 1)+ " ".repeat(n - i -1));
        }
    }
}
