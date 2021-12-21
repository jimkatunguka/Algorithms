package powerOf2;

public class Solution {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(1));
    }
    public static boolean powerOfTwo(int n){
        if(n < 1) return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}
