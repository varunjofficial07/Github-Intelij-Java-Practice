package javadsa.basicmaths;

public class AmstrongNum {
    public static void main(String[] args) {
        int num = 431;
        int org = num;
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit * lastDigit* lastDigit;
            num = num / 10;
        }
        if(org == sum){
            System.out.println("Amstrong");
        }
        else {
            System.out.println("Not amstrong");
        }
    }
}
