package Classe;

public class Date {

    int day;
    int month;
    int year;

    Date() {
        this(1, 1, 1970);
    }

    Date(int initialDay, int initialMonth, int initialYear) {
        this.day = initialDay;
        this.month = initialMonth;
        this.year = initialYear;
    }

    String obterDate() {
        return day + "/" + month + "/" + year;
    }

    void printFormatedDate() {
        System.out.println(this.obterDate());
    }

}
