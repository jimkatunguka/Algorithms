package Flexton;

import org.w3c.dom.ls.LSOutput;

public class AddOneToLastDigitInString {



    public static void main(String[] args) {
        String v1 = "v1";
        String v2 = v1.substring(0, v1.length()-1) + (Integer.parseInt(v1.substring(v1.length()-2, v1.length()-1) + 1));
        System.out.println(v2);
    }

}
