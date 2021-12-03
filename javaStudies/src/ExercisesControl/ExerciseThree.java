package ExercisesControl;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a grade");
        double gradeOne = entry.nextDouble();
        System.out.println("Enter a grade");
        double gradeTwo = entry.nextDouble();

        double average = (gradeOne + gradeTwo) / 2;

        if (average >= 7) {
            System.out.println("Approved");
        } else if (average < 7 && average > 4) {
            System.out.println("Recovery");
        } else {
            System.out.println("Disapproved");
        }

        entry.close();
    }
}
