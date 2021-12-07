package Classe;

public class DateMain {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.month = 12;
        date1.year = 2021;
        var date2 = new Date();
        date2.printFormatedDate();
        System.out.println(date1.obterDate());
        date1.printFormatedDate();
    }
}
