
package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner entry = new Scanner(System.in);
        System.out.println("Type first number: ");
        double num1 = entry.nextDouble();
        System.out.println("Type second number: ");
        double num2 = entry.nextDouble();
        System.out.println("Type the operation");
        String op = entry.next();

        double resultFinal = op.equals("+") ? num1 + num2 : 0;
        resultFinal = op.equals("-") ? num1 - num2 : resultFinal;
        resultFinal = op.equals("*") ? num1 * num2 : resultFinal;
        resultFinal = op.equals("/") ? num1 / num2 : resultFinal;
        resultFinal = op.equals("%") ? num1 % num2 : resultFinal;

        System.out.printf("O resultado da seguinte operação %.2f %s %.2f é %.2f%n", num1, op, num2, resultFinal);

        entry.close();
    }
}
