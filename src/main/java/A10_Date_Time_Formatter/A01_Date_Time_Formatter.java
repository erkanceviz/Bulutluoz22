package A10_Date_Time_Formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A01_Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime zmn=LocalDateTime.now();
        System.out.println("zmn = " + zmn); // zmn = 2024-06-16T23:41:09.774793

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println("zmn.format(dtf1) = " + zmn.format(dtf1)); // zmn.format(dtf1) = 16/06/2024

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d:MMMM:YY");

        System.out.println("zmn.format(dtf2) = " + zmn.format(dtf2)); // zmn.format(dtf2) = 16:Haziran:24

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE"); // 4.November.2022 Friday

        System.out.println(zmn.format(dtf3));

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(zmn.format(dtf4));// 07:19 PM



    }
}
