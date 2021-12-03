package ExercisesFundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entry = new Scanner(System.in);
        System.out.println("This program calculates the delta of a quadratic equation");
        System.out.println("Type a number");
        double a = entry.nextDouble();
        System.out.println("Type a number");
        double b = entry.nextDouble();
        System.out.println("Type a number");
        double c = entry.nextDouble();
        double delta = (Math.pow(b, 2) - 4 * a * c);
        System.out.println(delta);
        entry.close();
    }
}
