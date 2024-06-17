package A05_PassByValue;

import java.time.Period;

public class PassByValue {

    public static void main(String[] args) {


        double fiyat=100;

        System.out.println("indirimUygulama(fiyat) = " + indirimUygulama(fiyat));

        System.out.println(indirimUygulama(fiyat)); // fiyat = 90.0
        System.out.println(indirimUygulama(fiyat)); // fiyat = 90.0
        System.out.println(indirimUygulama(fiyat)); // fiyat = 90.0

        System.out.println("fiyat = " + fiyat); // fiyat = 100.0




        /*
    Kodlarimizin anlasi;ir olmasi icin main method'dan diger method'lara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable
    olusturmayi TERCIH EDERIZ

    Java method'lar arasinda gecis yaparken variable'i degil
    variable'in value'sunu pass eder

    Bu Java'nin Pass By Value'yu tercih etmesinden kaynaklaniyor


    Eger method'un icerisinde yaptiginiz degisikligin
    main method icin de gecerli olmasini isterseniz
    main method icerisinde
    fiyat= indirimUygula(fiyat);

    atamasini yapabiliriz.
     */


        System.out.println("indiririmYap10(fiyat) = " + indiririmYap10(fiyat));
        System.out.println("indiririmYap20(fiyat) = " + indiririmYap20(fiyat));
        System.out.println("indiririmYap30(fiyat) = " + indiririmYap30(fiyat));

        System.out.println("fiyat = " + fiyat);


    }

    public static double indiririmYap30(double fiyat) {
        fiyat=fiyat*0.7;
        return fiyat;
    }

    public static double indiririmYap20(double fiyat) {
        fiyat=fiyat*0.8;
        return fiyat;

    }

    public static double indiririmYap10(double fiyat) {

        fiyat=fiyat*0.9;
        return fiyat;

    }

    public static double indirimUygulama(double fiyat) {

        fiyat=fiyat*0.9;
        return fiyat;

    }
}
