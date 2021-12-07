package Classe;

public class Date {

    int day;
    int month;
    int year;

    Date() {
        day = day == 0 ? 01 : day;
        month = month == 0 ? 01 : month;
        year = year == 0 ? 1970 : year;
    }

    Date(int initialDay, int initialMonth, int initialYear) {
        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    String obterDate() {
        return day + "/" + month + "/" + year;
    }

    void printFormatedDate() {
        System.out.println(obterDate());
    }

}
