package fundamentos.operators;

public class Relational {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(30 != 7);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouMedia = nota >= 7;
        boolean hasDiscount = bomComportamento && passouMedia;

        System.out.println("Has discount? " + hasDiscount);

    }
}
