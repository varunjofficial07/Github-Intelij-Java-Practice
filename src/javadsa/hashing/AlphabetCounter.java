package javadsa.hashing;

public class AlphabetCounter {
    public static void main(String[] args) {
        char c = 'a';
        String s = "abaacd";
        System.out.println(countLetters(c,s));

    }
    static int countLetters(char c, String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
