package ooComposition.Challenges;

public class Produto {

    String name;
    double preco;

    Produto(String nome, double preco) {
        this.name = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
