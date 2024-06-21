package A16_Inheritance_Constructor_Call01;

public class DCAmry extends BToyota {



    DCAmry(String pc ){// Constructor
        super("Deniz");
        System.out.println("String parametreli Camry");
    }

    public DCAmry() {

    }


    public static void main(String[] args) {

        // Eger kullanilan argumente uygun bir constructor
        // parent class'da yoksa CTE olur

        DCAmry dcAmry2=new DCAmry("celal");
        //Parametreli Araba constructor
        //String parametreli Toyota constructor
        //String parametreli Camry


        System.out.println("::::::::::::::::::::::::::::::::::");

        DCAmry camry1=new DCAmry();
        //Parametresiz  Araba constructor
        //Parametresiz  BToyota constructor


    }
}
