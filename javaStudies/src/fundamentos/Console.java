
package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Good");
        System.out.print(" morning!\n\n");

        System.out.println("Good");
        System.out.println("morning: ");

        System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salary: %.1f%n", 1234.5678);

        System.out.printf("Name: %s\n", "João");

        Scanner entry = new Scanner(System.in);

        System.out.println("Type your age: ");
        int age = entry.nextInt();
        entry.nextLine();
        System.out.println("Type your firstname: ");
        String fName = entry.nextLine();
        System.out.println("Type your lastname: ");
        String lName = entry.nextLine();

        System.out.printf("Name: %s %s has %d years old", fName, lName, age);
        entry.close();

    }
}
