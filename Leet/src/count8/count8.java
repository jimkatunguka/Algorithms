package count8;

public class count8 {

    public static int count8(int n) {
        if(n==0) return 0;
        else if (n%10 == 8) return 1 + count8(n/8);
            //else if(n%100 == 88) return 3 + count8(n/8);

        else return count8(n/8);
    }

    public static void main(String[] args) {
        System.out.println(count8(818));
    }
}
