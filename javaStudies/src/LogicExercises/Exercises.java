package LogicExercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("100 logic exercises by guanabara(curso em video)");

        // Exercise 1
        // System.out.println("Hello World");

        // Exercise 2
        // System.out.println("Enter your name");
        // String name = entry.nextLine();
        // System.out.println("Hello " + name + " nice to meet you");

        // Exercise 3
        // System.out.println("Enter name");
        // String name = entry.nextLine();
        // System.out.println("Salary?");
        // double salary = entry.nextDouble();
        // System.out.println("Employee " + name + " has a salary of R$" + salary + " in
        // June");

        // Exercise 4
        // System.out.println("Enter value");
        // int n1 = entry.nextInt();
        // System.out.println("Enter value");
        // int n2 = entry.nextInt();
        // System.out.println("The sum between " + n1 + " and " + n2 + " equals " + (n1
        // + n2));

        // Exercise five
        // System.out.println("Enter value");
        // double n1 = entry.nextDouble();
        // System.out.println("Enter value");
        // double n2 = entry.nextDouble();
        // System.out.println("The average between " + n1 + " and " + n2 + " equals " +
        // (n1 + n2) / 2);

        // Exercise six
        System.out.println("Enter value");
        int n1 = entry.nextInt();
        System.out.println("Its predecessor is " + (n1 - 1) + " and its successor is " + (n1 + 1));

        entry.close();

    }
}
