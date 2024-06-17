package A02_Constructors2;

public class ArabaRunner {
    public static void main(String[] args) {


        Araba arb1=new Araba();
        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println(arb1); /* marka ='Citroen
                                    model ='C3
                                    yakit ='Benzin
                                    yil =2020
                                    fiyat =20000 */

        Araba arb2=new Araba("Volvo","CX60");
        System.out.println(arb2);
                                    /*marka ='Volvo
                                        model ='CX60
                                        yakit ='null
                                        yil =0
                                        fiyat =0 */

        Araba arb3=new Araba("Hyundai","i10",10000);
        System.out.println(arb3); /* marka ='Hyundai
                                            model ='i10
                                            yakit ='null
                                            yil =0
                                            fiyat =10000  */

        Araba arb4=new Araba("Porsche","Cayan","Lpg",1990,12000);
        System.out.println(arb4); /* marka ='Porsche
                                        model ='Cayan
                                        yakit ='Lpg
                                        yil =1990
                                        fiyat =12000 */



    }
}
