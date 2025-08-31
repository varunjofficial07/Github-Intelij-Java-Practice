package javadsa.hashing;

public class Counter {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,51,1,2,2,4};
        System.out.println(countN(2,arr));
    }
    static int countN(int n, int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == n){
                count++;
            }
        }
        return count;
    }
}
