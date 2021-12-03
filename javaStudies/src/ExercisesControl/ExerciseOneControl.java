package ExercisesControl;

import java.util.Scanner;

public class ExerciseOneControl {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.println("Type the number between 0-10");
        int number = entry.nextInt();

        if (number >= 0 && number <= 10) {
            if (number % 2 == 0) {
                System.out.println("Este número é par e esta entre 0 e 10");
            } else {
                System.out.println("Este número esta entre 0 e 10 mas é impar");
            }
        } else {
            System.out.println("Este number não esta entre 0 e 10");
        }

        entry.close();

    }
}
