package ooComposition.Challenges;

import java.util.ArrayList;
import java.util.List;

public class Item {

    int count;
    List<Produto> produtos = new ArrayList<>();

    Item() {

    }

    Item(int qtd) {
        this.count = qtd;
    }

    Item(int qtd, String nomeProd, double precoProd) {
        this.count = qtd;
        this.produtos.add(new Produto(nomeProd, precoProd));
    }

    // public double getPreco(){
    // return this.produtos.get()
    // }
}
