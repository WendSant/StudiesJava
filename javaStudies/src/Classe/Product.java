package Classe;

public class Product {

    String name;
    double prize;
    static double discount = 0.25;

    Product() {

    }

    Product(String initialName, double initialPrize) {
        name = initialName;
        prize = initialPrize;

    }

    double prizeDiscount() {
        return prize * (1 - discount);
    }

    double prizeDiscount(double discountGe) {
        return prize * (1 - discount + discountGe);
    }
}
