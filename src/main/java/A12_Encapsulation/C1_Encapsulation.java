package A12_Encapsulation;

public class C1_Encapsulation {
    public static void main(String[] args) {

        AEncapsuleClass pers1=new AEncapsuleClass();

        //pers1.hastaneIsmi="Java Hastanesi";  private oldugu icin gorulemez

        // pers1.hastaUcreti=10000; private oldugu icin kullanilamaz

        //pers1.hemsireAdresi="Ankara"; private oldugundan ulasilamaz
        // pers1.hemsireIsmi="Yildiz Yildiz";

       //  pers1.hemsireIsmi="Fatma"; private oldugundan ulasilamaz
        //  pers1.hemsireAdresi="Ankara"; private oldugundan ulasilamaz

        System.out.println(pers1.getHastaneIsmi()); // Yildiz Hastenesi

        pers1.setHastUcreti(1000);


        // getter ve setter method'lari
        // bazen de erisimi sinirlandirmak icin degil
        // kullanicilarin islevi iyi anlamasi icin kullanilir


        System.out.println(pers1.getHemsireAdresi()); // Yildiz Hastenesi
        pers1.setHemsireAdresi("Istanbul");// null

        System.out.println(pers1.getHemsireIsmi()); // Ayse


    }
}
