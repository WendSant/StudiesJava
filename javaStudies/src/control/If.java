package control;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Type the average");
        double ave = entry.nextDouble();

        if (ave <= 10 && ave >= 7) {
            System.out.println("Approved");
            System.out.println("Congratulations!!!");
        }
        if (ave < 7 && ave >= 5) {
            System.out.println("Recuperation");

        }
        boolean repro = ave < 4.5 && ave >= 0;

        if (repro) {
            System.out.println("Disapproved");
        }

        entry.close();

    }
}
