package A04_StaticBlocks;

public class C01_StaticBlocks {
    static {
        System.out.println("1.statik blok calisti");
    }




    public static void main(String[] args) {
        System.out.println("main method calisti");
    }

    static {
        System.out.println("2.static block calisti");
    }
}

//       1.statik blok calisti
//       2.static block calisti
//       main method calisti


