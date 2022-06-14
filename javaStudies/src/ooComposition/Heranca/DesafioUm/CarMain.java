package ooComposition.Heranca.DesafioUm;

public class CarMain {

    public static void main(String[] args) {

        Ferrari f1 = new Ferrari(250);

        System.out.println(f1);
        f1.acelerar();
        System.out.println(f1);
        f1.freiar();
        System.out.println(f1);
        f1.freiar();
        System.out.println(f1);

        Civic c1 = new Civic(100);

        System.out.println(c1);
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1);
        c1.freiar();
        System.out.println(c1);
        c1.freiar();
        c1.freiar();
        System.out.println(c1);

    }

}
