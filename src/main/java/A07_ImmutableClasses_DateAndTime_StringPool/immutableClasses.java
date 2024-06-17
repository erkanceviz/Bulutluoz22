package A07_ImmutableClasses_DateAndTime_StringPool;

import java.time.LocalDate;

public class immutableClasses {
    public static void main(String[] args) {

        // Bu kod calistiginda Java kac obje olusturur ?

        String str= "Ali"; // 1.obje ve 9 tane de . (nokta ) olunca = 10 tane obje olusur


        for (int i = 0; i <10 ; i++) {
            str+=".";

        }

        System.out.println(str); // Ali..........



    }
}
