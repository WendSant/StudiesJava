package ExercicesFundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner entry = new Scanner(System.in);

        System.out.println("Type your weight");
        double weight = entry.nextDouble();
        System.out.println("Type your height");
        double height = entry.nextDouble();
        double imc = weight / (Math.pow(height, 2));
        imc = imc < 1 ? imc * 10000 : imc;
        System.out.printf("Your bmi is %.2f%n", imc);
        entry.close();

    }
}
