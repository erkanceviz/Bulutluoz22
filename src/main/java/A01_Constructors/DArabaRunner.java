package A01_Constructors;

public class DArabaRunner {
    public static void main(String[] args) {

        DAraba arb1=new DAraba();
        System.out.println(arb1.marka);//  Marka Belirtilmedi
        System.out.println(arb1.model); //Model Belirtilmedi
        System.out.println(arb1.yakit); // null
        System.out.println(arb1.yil); // 0
        System.out.println(arb1.fiyat); // 0

        arb1.marka="Tofas"; // Tofas
        arb1.model="Kartal"; // Kartal
        arb1.yakit="Benzin"; // Benzin
        arb1.yil=1991;
        arb1.fiyat=50000; //


        System.out.println(arb1.marka);//
        System.out.println(arb1.model); //Model Belirtilmedi
        System.out.println(arb1.yakit); // null
        System.out.println(arb1.yil); // 1991
        System.out.println(arb1.fiyat); // 50000
        System.out.println(arb1.maxHiz(arb1.yakit)); // 230

        DAraba arb2=new DAraba();
        System.out.println(arb2); // toString getirmesi yapacagiz....

        DAraba arb3=new DAraba();

        System.out.println(arb3);


    }


}
