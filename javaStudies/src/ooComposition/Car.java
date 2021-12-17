package ooComposition;

public class Car {
    final Engine engine;

    Car() {
        this.engine = new Engine(this);
    }

    void acelerar() {
        if (engine.fatorInjecao < 2.6) {

            engine.fatorInjecao += 0.4;
        }

    }

    void frear() {
        if (engine.fatorInjecao > 0.5) {

            engine.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        engine.ligado = true;
    }

    void desligar() {
        engine.ligado = false;
    }

    boolean estaLigado() {
        return engine.ligado;
    }
}
