package javadsa.basicmaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDivisors {
    public static void main(String[] args) {
        int n = 36;
        List<Integer> divs = new ArrayList<>();
//        for (int i = 1; i <= n ; i++) {
//            if(n % i == 0){
//                divs.add(i);
//            }
//        }
//        System.out.println(divs);
        int srqtNum = (int) Math.sqrt(n);
        for (int i = 1; i <= srqtNum ; i++) {
            if(n % i == 0){
                divs.add(i);
                if(n / i != i){
                    divs.add(n / i);
                }
            }
        }
        Collections.sort(divs);
        System.out.println(divs);
    }
}
