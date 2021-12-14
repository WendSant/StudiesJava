package Classe.ChallengeModulo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Teste";
        p1.peso = 100;
        System.out.println(p1.nome);

        Comida c1 = new Comida();
        c1.nome = "Rosa";
        c1.peso = 0.500;

        Comida c2 = new Comida();
        c2.nome = "Rosa";
        c2.peso = 0.500;

        p1.comer(c1.peso);
        p1.comer(c2.peso);
        System.out.println(p1.peso);

    }
}
