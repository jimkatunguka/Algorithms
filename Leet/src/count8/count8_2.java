package count8;

public class count8_2 {
    public static void main(String[] args) {
        System.out.println(count8(89876));
    }
    public static int count8(int n){
        if(n==0) return 0;
        if(n%10 == 8) return 1 + count8(n/10);
        return count8(n/10);
    }
}
