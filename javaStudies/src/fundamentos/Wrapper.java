package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        Byte b = 127;
        Short s = 1000;
        // Integer i = Integer.parseInt(entry.next());
        Long l = 10000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        // System.out.println(i);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';

        System.out.println(c + "...");

        entry.close();

    }
}
