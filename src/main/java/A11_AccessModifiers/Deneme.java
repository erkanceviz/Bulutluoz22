package A11_AccessModifiers;

public class Deneme {


    @Override
    public String toString() {
        return "Deneme{}";
    }

    public static void main(String[] args) {


        A1_AccessModifiers obj=new A1_AccessModifiers();
        obj.sayi=12;
        obj.isim="yusuf";

        System.out.println("obj.isim = " + obj.isim); // yusuf
        System.out.println("obj.sayi = " + obj.sayi); // 12

        A1_AccessModifiers obj1=new A1_AccessModifiers();
        System.out.println("obj1.sayi = " + obj1.sayi); // 10
        System.out.println("obj1.isim = " + obj1.isim); // Erksa

    }


}


