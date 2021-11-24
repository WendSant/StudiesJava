package fundamentos.operators;

public class Ternary {
    public static void main(String[] args) {

        double media = 7.0;

        // É a interrogação que faz o bagulho funcionar, depois dela vem o que vai
        // substituir o true e em seguida o false
        String resultFinal = media >= 7.0 ? "aprovado" : "em recuperação";
        System.out.println("O aluno está " + resultFinal);

        double nota = 9;
        boolean bomComportamento = true;
        boolean passouPerMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPerMedia;
        String result = temDesconto ? "Sim." : "Não.";

        System.out.printf("Have discount? %s%n", result);

    }
}
