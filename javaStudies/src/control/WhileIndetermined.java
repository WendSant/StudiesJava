package control;

import java.util.Scanner;

public class WhileIndetermined {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String value = "";
        while (!value.equalsIgnoreCase("exit")) {
            System.out.print("You say: ");
            value = entry.nextLine();
        }
        System.out.println("End program");
        entry.close();
    }
}
