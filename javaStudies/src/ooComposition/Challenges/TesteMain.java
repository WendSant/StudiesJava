package ooComposition.Challenges;

import java.util.List;

public class TesteMain {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.nome = "densos";
        c1.compras.add(Item());
        System.out.println(c1.nome);
        System.out.println(c1.compras);

    }
}
