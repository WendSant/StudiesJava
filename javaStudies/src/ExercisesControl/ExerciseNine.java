package ExercisesControl;

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int highValue = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("%nEnter a number: ");
            int value = entry.nextInt();
            if (value > highValue) {
                highValue = value;
            }
        }
        System.out.printf("Highest value %d%n", highValue);

        entry.close();
    }
}
