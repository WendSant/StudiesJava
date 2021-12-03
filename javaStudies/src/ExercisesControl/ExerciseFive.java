package ExercisesControl;

import java.util.Scanner;

public class ExerciseFive {
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

        switch (result) {
            case 0:
                System.out.printf("O nuḿero %d é primo%n", number);
                break;
            default:
                System.out.printf("O nuḿero %d não é primo%n", number);
        }

        entry.close();
    }
}
