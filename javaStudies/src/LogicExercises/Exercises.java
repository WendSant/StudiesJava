package LogicExercises;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("100 logic exercises by guanabara(curso em video)");

        // Exercise 1
        // System.out.println("Hello World");

        // Exercise 2
        System.out.println("Enter your name");
        String name = entry.nextLine();
        System.out.println("Hello " + name + " nice to meet you");

        entry.close();

    }
}
