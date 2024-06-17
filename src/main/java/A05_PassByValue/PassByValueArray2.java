package A05_PassByValue;

import java.util.Arrays;

public class PassByValueArray2 {
    public static void main(String[] args) {


        // bir method olusturun
        // sayilar array'inin uzunlugundan 2 fazla olan
        // ve elementlerin tamami 5 olan yeni bir array olusturup
        // deger olarak sayilar array'ine atayin ve sayilar array'ini yazdirin


        int[] sayilar= {3,4,5,6};

        arrayeYeniDegerAta(sayilar);


        System.out.println(Arrays.toString(sayilar)); // [3, 4, 5, 6]


    }// main Sonu

    public static void arrayeYeniDegerAta(int[] sayilar){

      int[] yeniArray=new int[sayilar.length+2];

        for (int i = 0; i < yeniArray.length;  i++) {

            yeniArray[i]=5;
        }
        sayilar=yeniArray;

        System.out.println("method'da sayilar'in son hali : " + Arrays.toString(sayilar)); // method'da sayilar'in son hali : [5, 5, 5, 5, 5, 5]


    }








}
