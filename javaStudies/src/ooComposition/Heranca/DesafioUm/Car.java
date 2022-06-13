package ooComposition.Heranca.DesafioUm;

public class Car {

    int velocidadeAtual = 0;

    void acelerar() {
        if (velocidadeAtual >= 0) {
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
