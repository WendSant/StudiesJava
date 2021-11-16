package fundamentos;

public class ChalOperators {
    public static void main(String[] args) {

        // Primeiro calculo
        double z = 6;
        double x = 3;
        double y = 2;
        double baseAll = 10;

        double a = (z * (x + y));
        double b = Math.pow(a, 2);
        double c = b / (x * y);

        // Segundo calculo
        double m = 1;
        double n = 5;
        double o = 2;
        double p = 7;

        double w = (m - n) * (o - p);
        double i = w / o;
        double k = Math.pow(i, o);

        double f = (c - k);
        double u = Math.pow(f, 3);
        double base = Math.pow(baseAll, 3);
        double calc = u / base;

        System.out.println("O resultado é " + calc);

    }
}
