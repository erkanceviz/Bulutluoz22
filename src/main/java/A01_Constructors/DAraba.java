package A01_Constructors;

public class DAraba {


    String marka="Marka Belirtilmedi";
    String model="Model Belirtilmedi";
    String yakit;
    int yil;
    int fiyat;



    public int maxHiz(String yakit){
        int maxHiz=120;

        if (yakit.equalsIgnoreCase("dizel")){

            maxHiz=200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;

        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        }

        return maxHiz;
        }

    @Override
    public String toString() {
        return "Araba Özellileri " +
                "\nmarka ='" + marka +
                "\nmodel ='" + model +
                "\nyakit ='" + yakit +
                "\nyil =" + yil +
                "\nfiyat =" + fiyat
               ;

    }


}



