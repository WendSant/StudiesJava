package ExercicesFundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entry = new Scanner(System.in);
        System.out.println("Type the base of the triangle");
        double base = entry.nextDouble();
        System.out.println("Type the height of the triangle");
        double height = entry.nextDouble();
        double area = ((base * height) / 2);
        System.out.printf("The triangle area is %.2f%n", area);

        entry.close();
    }
}
