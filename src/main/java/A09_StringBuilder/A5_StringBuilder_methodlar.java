package A09_StringBuilder;

import A11_AccessModifiers.Deneme;

public class A5_StringBuilder_methodlar {
    public static void main(String[] args) {

        /*
   StringBuilder'da olmayan, String class'inda bulunan method'lari kullanmak isterseniz
   once toString() ile String'e cevirip, sonra String manipulation yapilabilir
         */



        StringBuilder sb=new StringBuilder("Java ne kadar guzel");
        System.out.println(sb.toString().contains("güzel")); // true

        System.out.println("sb = " + sb); // sb = Java ne kadar guzel

        sb.setCharAt(5,'N'); // Java Ne kadar guzel







    }
}
