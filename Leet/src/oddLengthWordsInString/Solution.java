package oddLengthWordsInString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(oddWords("I am going home"));
    }
    static List<String> oddWords(String s){
        List<String> oddWords = new ArrayList<>();

        for(String str: s.split(" ")){
            if(str.length() % 2 != 0){
                oddWords.add(str);
            }
        }
        return oddWords;
    }
}
