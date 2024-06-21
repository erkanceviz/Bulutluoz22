package A10_Date_Time_Formatter.A14_Inheritance;

public class BinekArac extends Arac{

    protected String marka="Binek araclarin markasi vardir";
    protected String model="Bindek araclarin modeli olur";
    protected int yil=1990;

    protected void hiz(String yakit){ // method
        System.out.println("Binek araclarin hizi modele gore degisir.");

    }
    protected void teker(){
        System.out.println("Binek araclarin 4 tekeri vardir.");

    }



}
