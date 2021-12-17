package ooComposition;

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.estaLigado());

        c.ligar();
        System.out.println(c.estaLigado());
        System.out.println(c.engine.giros());

        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        System.out.println(c.engine.giros());

        c.frear();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        System.out.println(c.engine.giros());

    }
}
