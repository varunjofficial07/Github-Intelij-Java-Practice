package javadsa.hashing;

import java.util.Scanner;

public class OptimizedAlphaCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //precompute
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        int q = sc.nextInt();
        while (q-- != 0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}
