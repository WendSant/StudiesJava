package control;

import java.util.Locale;
import java.util.Scanner;

public class ChallengeDayOfWeek {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entry = new Scanner(System.in);

        System.out.println("Type a day of the week(Sunday-Saturday)");
        String day = entry.nextLine();
        if (day.equalsIgnoreCase("sunday")) {
            System.out.println("You selected 1");
        } else if (day.equalsIgnoreCase("monday")) {
            System.out.println("You selected 2");
        } else if (day.equalsIgnoreCase("tuesday")) {
            System.out.println("You selected 3");
        } else if (day.equalsIgnoreCase("wednesday")) {
            System.out.println("You selected 4");
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("You selected 5");
        } else if (day.equalsIgnoreCase("friday")) {
            System.out.println("You selected 6");
        } else if (day.equalsIgnoreCase("saturday")) {
            System.out.println("You selected 7");
        } else {
            System.out.println("Option Invalid");
        }

        entry.close();

    }
}
