package ExercisesFundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner entry = new Scanner(System.in);

        System.out.println("This program convert celsius to fahrenheit!");
        System.out.println("Type number: ");
        double n1 = entry.nextDouble();

        double resultFinal = (n1 * 9 / 5) + 32;
        System.out.printf("The degree in fahrenheit is %.2f°C%n", resultFinal);

        entry.close();
    }
}
