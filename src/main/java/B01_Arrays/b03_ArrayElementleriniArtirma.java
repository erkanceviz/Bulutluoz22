package B01_Arrays;

import java.util.Arrays;

public class b03_ArrayElementleriniArtirma {
    private static Object arr;

    public static void main(String[] args) {


        int[] arr={10,12,14,16,18};

        elemntleri2artir(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); // [12, 14, 16, 18, 20]


    }// main disi

    public static int[] elemntleri2artir(int[]  arr) {


        for (int i = 0; i <arr.length; i++) {

            arr[i]=arr[i]+2;


        }

        return arr;
    }


}
