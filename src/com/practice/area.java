package com.practice;

public class area {
    int l = 20;
    int b = 30;
    static int classvar = 2000;
    void calc(){
        int areas = l * b;
        System.out.println("The area is: " + areas);

    }


    public static void main(String[] args) {
        area a = new area();
        a.calc();
        System.out.println("The Static variable value: "+ classvar);
    }
}
