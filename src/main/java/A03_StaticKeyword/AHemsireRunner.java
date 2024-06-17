package A03_StaticKeyword;

public class AHemsireRunner {
    public static void main(String[] args) {

        AHemsire h1=new AHemsire();
        System.out.println(h1); // AHemsire{personelIsim='Isim belirtilmedi', personelAdresi='Adres belirtilmedi', personelTelefon='Telefon belirtilmedi'}

        h1.personelIsim="Ayse";
        h1.personelAdresi="Cankaya / Ankara";
        h1.personelTelefon="3123425465";

        System.out.println("h1 = " + h1);
        /* h1 = AHemsire{personelIsim='Ayse', personelAdresi='Cankaya / Ankara', personelTelefon='3123425465',
        HastaneIsmi ='Yildiz Hastanesi', HastaneAdresi ='Cankaya / Ankara', BashekimAdi ='Dr Mehmet Yilmaz'} */

        AHemsire h2=new AHemsire();

        h2.personelIsim="Hatice";
        h2.personelAdresi="Sincan";
        h2.personelTelefon="3124323232";
        h2.bashekimIsmi="Yasar Kemal";




        System.out.println("h2 = " + h2);
        /* h2 = AHemsire{personelIsim='Hatice', personelAdresi='Sincan', personelTelefon='3124323232',
        HastaneIsmi ='Yildiz Hastanesi', HastaneAdresi ='Cankaya / Ankara', BashekimAdi ='Dr Mehmet Yilmaz'} */


        System.out.println("h1 = " + h1);//  BashekimAdi ='Yasar Kemal'} olaraka degisti

/* h1 = AHemsire{personelIsim='Ayse', personelAdresi='Cankaya / Ankara', personelTelefon='3123425465',
HastaneIsmi ='Yildiz Hastanesi', HastaneAdresi ='Cankaya / Ankara', BashekimAdi ='Yasar Kemal'} */

        System.out.println("h2 = " + h2); // BashekimAdi ='Yasar Kemal'} olaraka degisti

  /* h2 = AHemsire{personelIsim='Hatice', personelAdresi='Sincan', personelTelefon='3124323232',
HastaneIsmi ='Yildiz Hastanesi', HastaneAdresi ='Cankaya / Ankara', BashekimAdi ='Yasar Kemal'} */

        AHemsire h3=new AHemsire();
        h3.hastaneIsmi=" Java Hastanesi";

        System.out.println("h1.hastaneIsmi = " + h1.hastaneIsmi); // h1.hastaneIsmi =  Java Hastanesi
        System.out.println("h2.hastaneIsmi = " + h2.hastaneIsmi);  // h2.hastaneIsmi =  Java Hastanesi

        System.out.println("h3.hastaneIsmi = " + h3.hastaneIsmi); // h3.hastaneIsmi =  Java Hastanesi




    }
}
