package javadsa.basicmaths;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 15;
        checkPrime(num);

    }
    public static void checkPrime(int n){
        boolean prime = true;
        if (n <= 1){
            prime = false;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("prime");
            } else {
                System.out.println("Not  PRime");
            }
        }

    }
}
