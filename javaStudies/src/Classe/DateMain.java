package Classe;

public class DateMain {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.day = 04;
        date1.month = 12;
        date1.year = 2021;
        System.out.println(date1.obterDate());
    }
}
