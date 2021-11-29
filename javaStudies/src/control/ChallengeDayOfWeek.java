package control;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeDayOfWeek {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entry = new Scanner(System.in);

        System.out.println("Type a day of the week(1-7)");
        int day = entry.nextInt();
        if (day == 1) {
            System.out.println("You selected Sunday");
        } else if (day == 2) {
            System.out.println("You selected Monday");
        } else if (day == 3) {
            System.out.println("You selected Tuesday");
        } else if (day == 4) {
            System.out.println("You selected Wednesday");
        } else if (day == 5) {
            System.out.println("You selected Thursday");
        } else if (day == 6) {
            System.out.println("You selected Friday");
        } else if (day == 7) {
            System.out.println("You selected Saturday");
        } else {
            System.out.println("Option Invalid");
        }

        entry.close();

    }
}
