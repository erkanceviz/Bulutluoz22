package A15_Inheritance_Constructor_Call;

public class GCorolla extends FToyota {

    String mode="Corolla";
    String uretimYeri="TR";

    GCorolla(){
        super();
        System.out.println("Corolla constructor calisti.");
    }


    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla(); // Object
        System.out.println(corolla1.marka); // Toyota babasindan aldi.

    }
}
