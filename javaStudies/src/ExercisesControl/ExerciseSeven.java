package ExercisesControl;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entry = new Scanner(System.in);

        double total = 0;
        double numbers = 0;

        while (numbers >= 0) {
            System.out.println("Enter a number");
            numbers = entry.nextDouble();
            if (numbers < 0) {
                System.out.println("Programa encerrado");
                break;
            }
            total += numbers;
            System.out.printf("Total: %.2f%n", total);

        }

        entry.close();
    }
}
