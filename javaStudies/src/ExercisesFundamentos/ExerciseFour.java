package ExercisesFundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entry = new Scanner(System.in);
        System.out.println("Type a number");
        double n1 = entry.nextDouble();

        double squared = Math.pow(n1, 2);
        double cubed = Math.pow(n1, 3);

        System.out.printf("The squared number is %.2f and cubed is %.2f%n", squared, cubed);

        entry.close();

    }
}
