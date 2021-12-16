package Classe.ChallengeModulo;

import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Enter a name: ");
        p1.nome = entry.nextLine();
        System.out.println("Enter a weight: ");
        p1.peso = entry.nextDouble();

        Comida c1 = new Comida();
        System.out.println("Enter the name of the first meal");
        c1.nome = entry.next();
        System.err.println("Enter the weight of the first meal");
        c1.peso = entry.nextDouble();

        Comida c2 = new Comida();
        System.out.println("Enter the name of the second meal");
        c2.nome = entry.next();
        System.out.println("Enter the weight of the second meal");
        c2.peso = entry.nextDouble();
        double pesoT = c1.peso + c2.peso;
        p1.comer(c1);
        p1.comer(c2);
        System.out.println(p1.peso);
        System.out.printf("As refeições foram %s de %.2f gramas e %s de %.2f gramas, dando um peso total de %.2f%n",
                c1.nome, c1.peso, c2.nome, c2.peso, pesoT);
        System.out.printf("O peso atual do cliente %s é %.2f%n", p1.nome, p1.peso);
        entry.close();

    }
}
