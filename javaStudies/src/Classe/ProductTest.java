package Classe;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        Product p1 = new Product("Note", 1500);

        var p2 = new Product();
        p2.name = "Smartphone";
        p2.prize = 100;
        System.out.println(p1.name);
        System.out.println(p2.name);

        double finalPrize = p1.prizeDiscount();

        double finalPrize2 = p2.prizeDiscount();
        System.out.println(finalPrize2);
        Product.discount = 0.30;
        finalPrize2 = p2.prizeDiscount();
        System.out.println(finalPrize2);

        double average = (finalPrize + finalPrize2) / 2;

        System.out.printf("Products average: %.2f%n", average);

        entry.close();

    }
}
