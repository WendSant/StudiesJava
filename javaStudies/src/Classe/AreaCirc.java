package Classe;

public class AreaCirc {
    double radius;
    double pi;

    AreaCirc(double initialRadius) {
        pi = 3.14;
        radius = initialRadius;
    }

    double area() {
        return pi * Math.pow(radius, 2);
    }
}
