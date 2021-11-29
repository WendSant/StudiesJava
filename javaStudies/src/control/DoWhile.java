package control;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("You need to say the magic words");
            System.out.println("Exit?");
            text = entry.nextLine();
        } while (!text.equalsIgnoreCase("please"));

        entry.close();
    }
}
