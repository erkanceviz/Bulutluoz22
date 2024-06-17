package A09_StringBuilder;

public class A2_StringBuilder_methodlar {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();


        System.out.println(sb.append("hava güzel")); // 10
        System.out.println(sb.capacity()); // hava güzel yeni capacity 2*7+ 2 =16

        //*** String ter cevirir.. sb.reverse();

        sb.reverse(); // ters cevirir...

        System.out.println("sb = " + sb); //lezüg avah

        StringBuilder sb1=new StringBuilder(" hava");

        // .replace

        sb1.replace(0,1,"güzel...");
        System.out.println("sb1 = " + sb1); // sb1 = güzel...hava





    }
}
