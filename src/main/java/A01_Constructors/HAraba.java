package A01_Constructors;

public class HAraba {


    String marka="Marka Belirtilmedi";
    String model="Model Belirtilmedi";
    String yakit;
    int yil;
    int fiyat;


    public HAraba(String mrk,String mdl,String ykt,int yl,int fyt){
        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }

    public HAraba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public HAraba(){

        // gorunur durumdaki parametresiz constructor
        // default constructor DEGILDIR
        // Default constructor'in body'si de bos olur
        // ancak parametresiz constructor'da body'e kod yazilabilir

        // parametresiz constructor'in body'sinde kod yoksa
        // default constructor ile ayni islevi gorur
        // ama yine de gorunur durumdaysa default cons. denmez

    }




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
