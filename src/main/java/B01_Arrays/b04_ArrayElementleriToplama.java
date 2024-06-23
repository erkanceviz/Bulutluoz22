package B01_Arrays;

import java.util.Arrays;

public class b04_ArrayElementleriToplama {
    public static void main(String[] args) {


        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.


        int[] arr= {25,-2,10,-14,0,-2,6};


        System.out.println(sayilariToplama(arr));


    }// main disi

    public static  int sayilariToplama(int[] arr) {

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>0){
                toplam=toplam+arr[i];


            }

        }

        return toplam;
    }
}
