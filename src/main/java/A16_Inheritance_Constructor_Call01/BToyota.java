package A16_Inheritance_Constructor_Call01;

public class BToyota extends Araba {

    BToyota(){

        System.out.println("Parametresiz  BToyota constructor");

    }

    BToyota(int pt){

        System.out.println("Parametreli Toyota constructor");

    }

    BToyota(String pt2){
        super("Mehmet");

        System.out.println("String parametreli Toyota constructor");
    }
}
