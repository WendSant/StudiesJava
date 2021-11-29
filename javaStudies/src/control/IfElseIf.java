package control;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Type a note");
        Double nota = entry.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Invalid number");
        } else if (nota >= 8.1) {
            System.out.println("A, congratulations");
        } else if (nota >= 6.1) {
            System.out.println("B, recuperation");
        } else if (nota >= 4.1) {
            System.out.println("C, recuperation");
        } else if (nota >= 2.1) {
            System.out.println("D, final prove");
        } else {
            System.out.println("D, disapproved");

        }
        System.out.println("End program!");
        entry.close();
    }
}
