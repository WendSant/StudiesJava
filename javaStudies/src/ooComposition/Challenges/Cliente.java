package ooComposition.Challenges;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String nome;
    double valorTotalCompras = 0;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarProduto(String nome, double preco) {
        this.compras.get(0).itens.get(0).produtos.add(new Produto(nome, preco));
    }

    public String obterValorTotalCompras() {
        for (Compra compra : compras) {
            this.valorTotalCompras += compra.valorTotal();
        }
        return "O valor total das compras é: " + valorTotalCompras;
    }

    void adicionarCompra() {
        this.compras.add(new Compra());
    }
}
