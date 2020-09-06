package sumOfDigitsInInteger;

public class SumOfDigitsInteger {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsInteger(1097));
    }

    static int sum=0;
    public static int sumOfDigitsInteger(int n){
        while(n!=0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        return  sum;
        }
    }
