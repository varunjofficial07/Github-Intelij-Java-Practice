package javadsa.recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        printNto1(5,5);
    }
    static void printNto1(int i, int n){
        if(i < 1){
            return;
        }
        System.out.println(i);
        printNto1(i-1, n);
    }
}
