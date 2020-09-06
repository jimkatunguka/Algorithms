package permutation;

public class Permutation {
    public static void main(String[] args) {
        String s = "ABC";
        permute(s, 0, s.length()-1);

    }

    public static void permute(String str, int l, int r){
        if(l==r)
            System.out.println(str);
        else
        {
            for(int i=l; i<=r; i++)
            {
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[]charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
