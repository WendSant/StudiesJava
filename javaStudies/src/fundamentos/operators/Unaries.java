package fundamentos.operators;

public class Unaries {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        a++;
        a--;

        ++b;
        --b;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Challenger: ");
        System.out.println(++a == b--);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);

    }
}
