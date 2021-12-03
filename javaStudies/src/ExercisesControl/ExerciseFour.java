package ExercisesControl;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int result = 0;
        System.out.println("Type a number");
        int number = entry.nextInt();

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result++;
                break;

            }
        }
        if (result == 0) {
            System.out.printf("O número %d é primo", number);
        } else {
            System.out.printf("O número %d não é primo%n", number);

        }

        entry.close();
    }
}
