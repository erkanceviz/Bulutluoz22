package A05_PassByValue;

import java.util.Arrays;

public class PassByValueArray {
    public static void main(String[] args) {


        // bir method olusturalim ve method'da list'deki sayilari 5 artiralim
        // ve method'da listenin son halini yazdiralim

        int[] arr={3,4,5};

        elemenlari5Artir(arr); // [8, 9, 10]
        elemenlari5Artir(arr); // [13, 14, 15]
        elemenlari5Artir(arr); // [18, 19, 20]

        System.out.println("Method sonrasi "+ Arrays.toString(arr)); // Method sonrasi [18, 19, 20]



    }

    public static void elemenlari5Artir(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+5;

        }

        System.out.println(Arrays.toString(arr));

    }







}
