package fundamentos.operators;

public class Logics {
    public static void main(String[] args) {

        boolean condition1 = true;
        boolean condition2 = 3 > 7;

        System.out.println(condition1 && !condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!!condition2);
        System.out.println(!condition2);

        System.out.println("Tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(false && false);

        System.out.println("\nTabela verdade ou(OR)");
        // System.out.println(true || true);
        // System.out.println(true || false);
        System.out.println(false || true);
        // System.out.println(false && false);

        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\n Tabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);

    }
}
