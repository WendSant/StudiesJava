package ExercisesControl;

import java.util.Random;
import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        // Gerador do numero
        int again, tries, numberRandom, guessNumber;
        do {
            Random random = new Random();
            numberRandom = random.nextInt(100);
            System.out.println("Número aleatorio abaixo, caso queira tentar acertar só comentar a linha ou apaga-la");
            System.out.println(numberRandom);

            for (tries = 9; tries >= 0; tries--) {
                System.out.println("Enter your guess");
                guessNumber = entry.nextInt();
                if (guessNumber >= 0 && guessNumber <= 100) {
                    if (guessNumber == numberRandom) {
                        System.out.println("Congratulations");
                        break;
                    } else if (guessNumber > numberRandom) {
                        System.out.println("Your guess is greater than the number generated ");
                        System.out.printf("You have %d attempts%n", tries);
                    } else {
                        System.out.println("Your guess is less than the generated number ");
                        System.out.printf("You have %d attempts%n", tries);
                    }
                } else {
                    System.out.println("Invalid Number enter a number between 0-10");
                }
            }

            System.out.println("Try again? Enter 0 to exit and any other number to continue");
            again = entry.nextInt();

        } while (again != 0);

        System.out.println("End!");
        entry.close();
    }

}
