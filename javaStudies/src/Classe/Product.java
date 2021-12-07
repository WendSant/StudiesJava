package Classe;

public class Product {

    String name;
    double prize;
    double discount;

    Product() {

    }

    Product(String initialName, double initialPrize, double initialDiscount) {
        name = initialName;
        prize = initialPrize;
        discount = initialDiscount;

    }

    double prizeDiscount() {
        return prize * (1 - discount);
    }

    double prizeDiscount(double discountGe) {
        return prize * (1 - discount + discountGe);
    }
}
