package A05_PassByValue;

import java.util.ArrayList;
import java.util.List;

;

public class PassByValueList {
    public static void main(String[] args) {

        // bir method olusturalim ve method'da list'deki sayilari 5 artiralim
        // ve method'da listenin son halini yazdiralim

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elemenlari5Artirma(sayilar); // sayilar = [15, 25, 35]
        elemenlari5Artirma(sayilar); // sayilar = [20, 30, 40]
        elemenlari5Artirma(sayilar); // sayilar = [25, 35, 45]

        System.out.println("Method call sonrasi main method da list = " + sayilar); // Method call sonrasi main method da list = [25, 35, 45]


    }

    public static void elemenlari5Artirma(List<Integer> sayilar) {

        for (int i = 0; i < sayilar.size() ; i++) {


            sayilar.set(i, sayilar.get(i)+5);


        }

        System.out.println("sayilar = " + sayilar);

    }


}


