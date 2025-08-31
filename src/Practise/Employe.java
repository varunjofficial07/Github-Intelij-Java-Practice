package Practise;
public class Employe {
    static int count =0;
    Employe(){
        count++;
    }
    static void showCount(){
        System.out.println("Total Count is : " + count);
    }
}
class  Main{
    public static void main(String[] args) {
        Employe emp = new Employe();
        Employe emp2 = new Employe();
        Employe emp3 = new Employe();
        Employe.showCount();
    }
}