package ooComposition;

public class Engine {

    final Car car;
    boolean ligado = false;
    double fatorInjecao = 1;

    Engine(Car car) {
        this.car = car;
    }

    int giros() {
        if (!ligado) {
            return 0;
        } else {

            return (int) Math.round(fatorInjecao * 3000);
        }
    }

}
