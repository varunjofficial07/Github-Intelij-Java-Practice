package javadsa.patterns;

public class AlphaTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for(char ch = (char) ('E' - i); ch <= 'E'; ch++){
                System.out.print(ch);

            }
            System.out.println();

        }
    }
}
