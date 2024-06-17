package A09_StringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class A1_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        System.out.println("sb = " + sb.capacity()); // 7
        System.out.println("sb.length() = " + sb.length());// 0

        sb.append("java");

        System.out.println("sb = " + sb); // java

        System.out.println(sb.length()); // 4
        sb.append(" Güzeldir.");

        System.out.println("sb = " + sb);
        System.out.println("sb.capacity() = " + sb.capacity()); // 7*2+2 = 16
        System.out.println("sb.length() = " + sb.length()); // 14

        sb.append(" ona ne suphe");
        System.out.println("sb = " + sb);
        System.out.println("sb.capacity() = " + sb.capacity()); // 34 16*2+2= 34





    }








}
