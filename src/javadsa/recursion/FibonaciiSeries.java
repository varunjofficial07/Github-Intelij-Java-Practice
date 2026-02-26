package javadsa.recursion;

import java.util.Scanner;

public class FibonaciiSeries {
    public static int fibo(int n){
        if(n <= 1){
            return n;
        }
        int flast = fibo(n-1);
        int slast = fibo(n-2);
        return flast+slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
