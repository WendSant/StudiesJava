package Classe;

public class AreaCirc {
    double radius;
    static final double PI = 3.1415;

    AreaCirc(double initialRadius) {
        radius = initialRadius;
    }

    double area() {
        return PI * Math.pow(radius, 2);
    }

    static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }
}
