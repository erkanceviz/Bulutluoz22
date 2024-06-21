package A15_Inheritance_Constructor_Call;


public class FToyota extends EAraba {

    FToyota(){ // constructors
        super();
        System.out.println("Toyota constructors calisti.");
    }

    protected String marka="Toyota";
    protected String motor="Toyota araclar cevrecidir.";
    protected String uretimYeri="Üretim yeri belirtilmemis";
    protected int hiz=140;


}
