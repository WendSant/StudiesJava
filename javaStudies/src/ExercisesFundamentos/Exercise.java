package ExercisesFundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner entry = new Scanner(System.in);

        System.out.println("This program convert fahrenheit to celsius!");
        System.out.println("Type number: ");
        double n1 = entry.nextDouble();

        double resultFinal = (n1 - 32) * 5 / 9;
        System.out.printf("The degree in celsius is %.2f°C%n", resultFinal);

        entry.close();
    }
}
