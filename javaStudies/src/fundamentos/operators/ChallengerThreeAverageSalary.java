
package fundamentos.operators;

import java.util.Locale;
import java.util.Scanner;

public class ChallengerThreeAverageSalary {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter first salary");
        String firstSalary = entry.nextLine().replace(",", ".");
        System.out.println("Enter second salary");
        String secondSalary = entry.nextLine().replace(",", ".");
        System.out.println("Enter third salary");
        String thirdSalary = entry.nextLine().replace(",", ".");
        double fSalary = Double.parseDouble(firstSalary);
        double sSalary = Double.parseDouble(secondSalary);
        double tSalary = Double.parseDouble(thirdSalary);
        double averageSalary = (fSalary + sSalary + tSalary) / 3;
        System.out.printf("A média de salários é: %.2f%n", averageSalary);

        entry.close();
    }
}
