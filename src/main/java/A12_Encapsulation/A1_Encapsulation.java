package A12_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A1_Encapsulation {

    /*
    /*
            Buyuk projelerde datayi gorme(read) veya datayi degistirme (write)
            yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir

            Access modifier ile class uyelerine baska class'lardan erisim sinirlandirilabilir

            ANCAK

            ulasilabilen dataya hem okuma hem yazma yapilabilirken
            ulasilamayan data ne okunabilir ne de degistirilebilir

            gercek hayatdaki ihtiyaclar dusunuldugunde
            Javaya yetki sinirlamayi uyarlamak istersek

            - Eger okuma ve yazma yetkisini birlikte vermek veya vermemek soz konusu ise
              access modifier kullanilir

            - Eger okuma ve yazma yetkileri birbirinden ayrilacaksa
              o zaman access modifier yeterli olmaz
              Encapsulation(getter ve setter method'lari) kullanilmalidir.
     */

    // // get ve set daha onceki java objelerinde karsimiza cikmisti

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

        System.out.println("sayilar.get(1) = " + sayilar.get(1)); // sayilar.get(1) = 3

        // sayilar.get(1)=10; get okumaya izin var ama ATAMAYA yani YAZMAYA IZIN YOK:::::

        System.out.println("sayilar.set(1) = " + sayilar.set(1,22));

        System.out.println(sayilar); // [2, 22, 5]

        // System.out.println(sayilar.set(1));


    }











}
