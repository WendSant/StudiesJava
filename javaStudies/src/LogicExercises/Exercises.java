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
        // System.out.println("Enter value");
        // int n1 = entry.nextInt();
        // System.out.println("Its predecessor is " + (n1 - 1) + " and its successor is
        // " + (n1 + 1));

        // Exercise seven
        // System.out.println("Enter value");
        // double n1 = entry.nextDouble();
        // System.out.println("The double of " + n1 + " is " + (n1 * 2) + " and its
        // third part is " + (n1 / 3));

        // Exercise eight
        // System.out.println("Enter value");
        // double n1 = entry.nextDouble();
        // System.out.println("The distance of " + n1 + " corresponds to:");
        // System.out.print((n1 / 1000) + "Km " + n1 * 10 + "dm\n");
        // System.out.print((n1 / 100) + "Hm " + n1 * 100 + "cm\n");
        // System.out.print((n1 / 10) + "Dam " + n1 * 1000 + "mm\n");

        // Exercise nine
        // System.out.println("Enter value");
        // double n1 = entry.nextDouble();
        // System.out.println("Money available in dollar $" + (n1 * 3.45));

        // Exercise ten
        // System.out.println("Enter value");
        // double n1 = entry.nextDouble();
        // System.out.println("Enter value");
        // double n2 = entry.nextDouble();
        // System.out.println("The area is " + (n1 * n2) + "m?? and the amount of paint
        // needed is " + ((n1 * n2) / 2));

        // Exercise eleven
        System.out.println("Enter value of A");
        int n1 = entry.nextInt();
        System.out.println("Enter value of B");
        int n2 = entry.nextInt();
        System.out.println("Enter value of C");
        int n3 = entry.nextInt();

        System.out.println("The delta is " + (Math.pow(n2, 2) - 4 * n1 * (n3)));

        entry.close();

    }
}
