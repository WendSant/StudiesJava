package Classe;

public class NullValue {
    public static void main(String[] args) {

        String s1 = "";

        System.out.println(s1.concat("!!!"));

        Date d1 = Math.random() > 0.5 ? new Date() : null;

        if (d1 != null) {

            d1.month = 3;
        }

        String s2 = Math.random() > 0.5 ? "Hi" : null;
        if (s2 != null) {

            System.out.println(s2.concat("!!!"));
        }

    }
}
