package A16_Inheritance_Constructor_Call01;

public class Corolla extends BToyota {

    Corolla (int pc){ // COS 1
        super(5);

        System.out.println("Parametreli Corolla constructor");
    }

    public Corolla() { //Parametresiz Constructor -COS2

    }

    Corolla(String str){
        this(); // Bu class daki Parametresiz Constructor
        System.out.println("String parametreli Corolla constructor");
    }


    public static void main(String[] args) {

        Corolla corolla3=new Corolla("ilker");
        //Parametresiz  Araba constructor
        //Parametreli Toyota constructor
        //Parametreli Corolla constructor



        Corolla corolla1=new Corolla(); // Parametresiz Constructor olusturduk. Yukarida..
        //Parametresiz  Araba constructor
        //Parametresiz  Btoyota constructor

        System.out.println("__________________________________________");

        Corolla corolla2=new Corolla(3); // COS1
        //Parametresiz  Araba constructor
        //Parametreli Toyota constructor
        //Parametreli Corolla constructor


    }
}
