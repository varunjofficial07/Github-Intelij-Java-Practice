package javadsa.patterns;

public class Alphabets {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n ; i++) {
//            for (char ch = 'A'; ch <= 'A' + i; ch++) {
//                System.out.print(ch);
//            }
            for (char ch = 'A'; ch <= 'A' + (n -i - 1); ch++) {
                System.out.print(ch);
            }
            System.out.println();

        }
    }
}
