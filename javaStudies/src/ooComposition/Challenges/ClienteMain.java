package ooComposition.Challenges;

import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        Cliente c1 = new Cliente("Marlon");
        c1.compras.add(new Compra());
        c1.compras.get(0).itens.add(new Item(5, "Borracha", 2.50));
        c1.compras.get(0).itens.add(new Item(6, "Lapis", 1));
        c1.compras.add(new Compra());
        c1.compras.get(1).itens.add(new Item(2, "Caderno", 10.0));
        c1.compras.get(1).itens.add(new Item(5, "Estojo", 2.50));

        // System.out.println(c1.compras.get(0).itens.get(0).produtos.size());
        System.out.println(c1.compras.get(0).valorTotal());
        System.err.println("==================================");
        System.out.println(c1.compras.get(1).valorTotal());
        System.err.println("==================================");
        System.out.println(c1.obterValorTotalCompras());
        System.err.println("==================================");

        entry.close();

    }
}
