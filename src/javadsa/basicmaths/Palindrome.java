package javadsa.basicmaths;

public class Palindrome {
    public static void main(String[] args) {
        int num = 3;
        int org = num;
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(rev);
        if(rev == org) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("NOt palindrome");
        }
    }
}
