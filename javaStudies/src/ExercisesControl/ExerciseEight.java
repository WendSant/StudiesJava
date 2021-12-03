package ExercisesControl;

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Type the word: ");
        String word = entry.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        entry.close();
    }
}
