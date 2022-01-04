package firstUniqueChar;

import java.util.HashMap;

public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqCharacter("strstr"));
    }
    static int firstUniqCharacter(String s){
        HashMap<Character, Integer> counter = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(counter.containsKey(c)){
                counter.put(c, counter.get(c) + 1);
            }
            else {
                counter.put(c, 1);
            }
        }

        for(Character ch: s.toCharArray()){
            if(counter.get(ch) == 1){
                System.out.println(counter);
                return s.indexOf(ch);
            }
        }
        return -1;
    }
}
