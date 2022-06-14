package ooComposition.Heranca.DesafioUm;

public class Ferrari extends Car {

    Ferrari(int velomax) {
        super(velomax);
    }

    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

    void freiar() {
        super.freiar();
        super.freiar();
        super.freiar();
    }

}
