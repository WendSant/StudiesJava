package Classe.ChallengeModulo;

public class Pessoa {
    String nome;
    double peso;

    Pessoa() {

    }

    Pessoa(String nome, double peso) {

        this.nome = nome;
        this.peso = peso;

    }

    void comer(Comida comida) {
        this.peso += comida.peso;
    }
}
