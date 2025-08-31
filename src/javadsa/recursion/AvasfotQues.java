package javadsa.recursion;

public class AvasfotQues {
    public static void main(String[] args) {
        System.out.println(printf(3));

    }
    static int printf(int n){
        if(n <= 0){
            return 0;
        }
        return printf(n-1) + ++n;
    }
}
