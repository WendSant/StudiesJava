package ExercisesControl;

import java.util.Random;
import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        // Gerador do numero
        int again;
        do {
            Random random = new Random();
            int numberRandom = random.nextInt(100);
            System.out.println("Número aleatorio abaixo, caso queira tentar acertar só comentar a linha ou apaga-la");
            System.out.println(numberRandom);

            for (int tentantivas = 9; tentantivas >= 0; tentantivas--) {
                System.out.println("Enter your guess");
                int palpite = entry.nextInt();
                if (palpite >= 0 && palpite <= 100) {
                    if (palpite == numberRandom) {
                        System.out.println("Congratulations");
                        break;
                    } else if (palpite > numberRandom) {
                        System.out.println("Your guess is greater than the number generated ");
                        System.out.printf("You have %d attempts%n", tentantivas);
                    } else {
                        System.out.println("Your guess is less than the generated number ");
                        System.out.printf("You have %d attempts%n", tentantivas);
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
