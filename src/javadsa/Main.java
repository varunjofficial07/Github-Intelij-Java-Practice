package javadsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the No: ");
//        int num = sc.nextInt();
//        int c = 2;
//        while (c < num){
//            if(num % c == 0){
//                System.out.println("Not Prime");
//                c += 1;
//            }
//            else {
//                System.out.println("Prime");
//            }
//            break;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int max =a;
            if(b > max) {
                max = b;
            }
            if(c > b){
                max = c;
            }
        System.out.println(max);

    }
}
