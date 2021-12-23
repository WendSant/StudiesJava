package Classe;

public class Equals {
    public static void main(String[] args) {

        User u1 = new User();
        u1.name = "WendSant";
        u1.email = "wendsonsant@gmail.com";

        User u2 = new User();
        u2.name = "WendSant";
        u2.email = "wendsonsant@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }
}
