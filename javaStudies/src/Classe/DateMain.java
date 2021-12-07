package Classe;

public class DateMain {
    public static void main(String[] args) {
        Date date1 = new Date(27, 8, 2000);
        var date2 = new Date();
        date2.printFormatedDate();
        System.out.println(date1.obterDate());
        date1.printFormatedDate();
    }
}
