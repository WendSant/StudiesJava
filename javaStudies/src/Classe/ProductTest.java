package Classe;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        Product p1 = new Product();
        p1.name = "Note";
        p1.prize = 1500;
        p1.discount = 0.20;

        var p2 = new Product();
        p2.name = "Smartphone";
        p2.prize = 900;
        p2.discount = 0.15;

        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrize = p1.prizeDiscount();
        double finalPrize2 = p2.prizeDiscount(0.2);
        double average = (finalPrize + finalPrize2) / 2;

        System.out.printf("Products average: %.2f%n", average);

        entry.close();

    }
}
