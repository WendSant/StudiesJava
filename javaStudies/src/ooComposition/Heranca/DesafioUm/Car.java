package ooComposition.Heranca.DesafioUm;

public class Car {

    final int VELOCIDADEMAX;
    int velocidadeAtual = 0;

    Car(int velomax) {
        this.VELOCIDADEMAX = velomax;
    }

    void acelerar() {
        if (velocidadeAtual + 5 > VELOCIDADEMAX) {
            velocidadeAtual = VELOCIDADEMAX;
        } else {
            velocidadeAtual += 5;
        }
    }

    void freiar() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 5;
        }
    }

    @Override
    public String toString() {
        return "Velocidade atual do transformers: " + velocidadeAtual + "KM/h";
    }

}
