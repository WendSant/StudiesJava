package Classe;

public class Product {

    String name;
    double prize;
    double discount;

    double prizeDiscount() {
        return prize * (1 - discount);
    }

    double prizeDiscount(double discountGe) {
        return prize * (1 - discount + discountGe);
    }
}
