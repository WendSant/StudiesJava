package ooComposition;

public class CompraMain {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Wendson";

        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.adicionarItem(new Item("Borracha", 12, 3.85));
        compra1.adicionarItem(new Item("Caderneta", 2, 7));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

        // Relação bidimensional

        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println(total);
    }
}
