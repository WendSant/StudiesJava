package ooComposition.Challenges;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    public double valorTotal() {
        double valueTotal = 0;
        for (Item item : itens) {
            for (Produto item2 : item.produtos) {
                // System.out.println("O produto é: " + item2.name + " seu preço é: " +
                // item2.preco + " sua quantidade: "
                // + item.count);
                valueTotal += item2.preco * item.count;
            }
        }
        return valueTotal;
    }
}
