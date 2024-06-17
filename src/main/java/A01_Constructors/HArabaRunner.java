package A01_Constructors;

public class HArabaRunner {
    public static void main(String[] args) {

        HAraba arb1=new HAraba();

        arb1.marka="Toyota"; // Tofas
        arb1.model="Corolla"; // Kartal
        arb1.yakit="Dizel"; // Benzin
        arb1.yil=2010;
        arb1.fiyat=12000;

        System.out.println(arb1);


        HAraba arb2=new HAraba("Honda","Civic","Benzin",2011,11000);

        System.out.println(arb2); // marka ='Honda
                                    // model ='Civic
                                    // yakit ='Benzin
                                    // yil =2011
                                     // fiyat =11000

        HAraba arb3=new HAraba("Opel","Astra","Dizel",2013,10000);
        System.out.println(arb3); /*marka ='Opel
                                                model ='Astra
                                                yakit ='Dizel
                                                yil =2013
                                                fiyat =10000*/

        HAraba arb4=new HAraba("Tesla","x",2020);
        System.out.println(arb4); /* Araba Özellileri
                                        marka ='Tesla
                                        model ='x
                                        yakit ='null
                                        yil =2020
                                        fiyat =0 */




    }
}
