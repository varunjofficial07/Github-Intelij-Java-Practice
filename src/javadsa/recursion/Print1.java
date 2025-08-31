package javadsa.recursion;

public class Print1 {
    public static void main(String[] args) {
        func1();
    }
    static void func1(){
        System.out.println("1");
        func1();
    }
}
