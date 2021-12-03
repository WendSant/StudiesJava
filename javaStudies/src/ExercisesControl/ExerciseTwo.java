package ExercisesControl;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = entry.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }

        entry.close();
    }
}
