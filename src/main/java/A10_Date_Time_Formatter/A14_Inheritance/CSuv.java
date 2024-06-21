package A10_Date_Time_Formatter.A14_Inheritance;

public class CSuv extends BinekArac{


    @Override
    public String toString() {
        return "CSuv{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", motor='" + motor + '\'' +
                ", plaka='" + plaka + '\'' +
                ", yakit='" + yakit + '\'' +
                '}';
    }

    public static void main(String[] args) {


        CSuv suv1=new CSuv();
        System.out.println(suv1.marka); // Binek araclarin markasi vardir
        System.out.println(suv1.model); // Bindek araclarin modeli olur
        System.out.println(suv1.motor); // Tüm araclar motor kullanir

        System.out.println(suv1.plaka); // Tüm araclar plakasi oliur.
        System.out.println(suv1.yakit); // Araclar farkli yakitlar kullanir.

        suv1.teker(); // Binek araclarin 4 tekeri vardir. ilk yakin child den alir.../Binek aractan)


        CSuv suv2=new CSuv();
        suv2.marka="Honda";
        suv2.model="civic";
        suv2.motor="1.6";
        suv2.plaka="06 KHH 77";
        suv2.yakit="Benzin";
        suv2.yil=2008;

        suv2.hiz(suv2.yakit);



        System.out.println(suv2);
        // CSuv{marka='Honda', model='civic', yil=2008, motor='1.6', plaka='06 KHH 77', yakit='Benzin'}




    }

    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){

            System.out.println("Benzinli SUV ler max 300 km hitz yapar.. ");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Benzinli SUV ler max 240 km hitz yapar.. ");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit  SUV ler max 220 km hitz yapar.. ");
        }else {
            System.out.println("yakit belli degil, hiz söyleyemem");
        }

    }


}
