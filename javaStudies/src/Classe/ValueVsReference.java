package Classe;

public class ValueVsReference {
    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a++;
        b--;
        System.out.println(a + " " + b);

        Date d1 = new Date(1, 6, 2022);
        Date d2 = d1;

        d1.day = 27;
        d2.month = 8;

        d1.year = 2000;

        System.out.println(d1.obterDate());
        System.out.println(d2.obterDate());

        afterDate(d1);

        System.out.println(d1.obterDate());
        System.out.println(d2.obterDate());

        int e = 7;
        changePrimitive(e);
        System.out.println(e);

    }

    static void afterDate(Date c) {
        c.day = 1;
        c.month = 1;
        c.year = 1970;
    }

    static void changePrimitive(int a) {
        a++;
    }
}
