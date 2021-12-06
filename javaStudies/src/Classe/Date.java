package Classe;

public class Date {

    int day;
    int month;
    int year;

    String obterDate() {
        return day + "/" + month + "/" + year;
    }

    void printFormatedDate() {
        System.out.println(obterDate());
    }

}
