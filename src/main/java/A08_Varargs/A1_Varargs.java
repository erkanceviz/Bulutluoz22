package A08_Varargs;

public class A1_Varargs {
    public static void main(String[] args) {

        topla(5,7,5,2,3,0);
        topla(2,34,5,77);



    }

    public static void topla(int... sayilar ) {

        int toplam=0;

        for (int each :sayilar){

            toplam=toplam+each;
        }

        System.out.println("toplam = " + toplam);


    }
}
