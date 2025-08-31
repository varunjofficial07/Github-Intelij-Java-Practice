package javadsa.basicmaths;

public class GCD {
    public static void main(String[] args) {
        gcdNum(15,20);
    }
    static void gcdNum(int a, int b){
        while (a > 0 && b > 0){
            if(a > b){
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a ==0){
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }
}
