package data_types;

import java.io.PrintStream;

public class Ternary {
    static  String a = "bag";
    static  String b = "girl";

    public static void main(String[] args) {
        System.out.println(results());
        System.out.println(monthDays(12));
    }

      static boolean results(){
        boolean result = false;
        for(int i = 0; i < a.length(); i++ ){
            String e1 = String.valueOf(a.toCharArray()[i]), e2 = String.valueOf(b.toCharArray()[i]);
            result = e1 == null? e2 == null:e1.equals(e2); //Ternary operator.
        }
        return result;
    }

    static int monthDays(int month){ // Switch statement
        int days = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;

            case 2:
                days = 28;
                break;

            default:
                days = 30;
        }
        return days;
    }

}
