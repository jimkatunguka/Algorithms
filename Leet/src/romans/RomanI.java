package romans;

public class RomanI {
    public static void main(String[] args) {
        System.out.println(intToRoman(20000));
    }
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < values.length; i++){
            if(num == 0) break;
            int value = values[i];
            int toAdd = num / value;
            num = num % value;
            while(toAdd-- > 0){
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}
