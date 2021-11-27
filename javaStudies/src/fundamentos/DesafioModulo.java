
package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner entry = new Scanner(System.in);
        System.out.println("Type first number: ");
        String num1 = entry.nextLine().replace(",", ".");
        System.out.println("Type second number: ");
        String num2 = entry.nextLine().replace(",", ".");
        entry.close();
    }
}
