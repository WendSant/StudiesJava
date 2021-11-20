
package fundamentos;

import java.util.Random;
import java.util.Scanner;

public class GamePalpite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type language en or pt(Digite a linguagem en ou pt)");
        String language = scanner.nextLine();
        String frasePtWelcome = "", frasePtWelcomeTwo = "", fraseDigOqAcha = "", fraseErroUmDig = "", win = "";

        if (language.equalsIgnoreCase("pt")) {
            frasePtWelcome = "Bem-vindo ao jogo Bulls and Cows";
            frasePtWelcomeTwo = "Este é um jogo mental lógico"
                    + "\nAqui B significa que um dos seus números de adivinhação está dentro do número escondido e no lugar certo"
                    + "\nAqui C significa que um dos seus números de adivinhação está dentro do número oculto, mas no lugar errado";
            fraseDigOqAcha = "Digite seu palpite";
            fraseErroUmDig = "Você inseriu um numero de um digite por favor digite um número de 10 a 99";
            win = "Parabéns você ganhou";

        } else {
            frasePtWelcome = "Welcome to the Bulls and Cows game!";
            frasePtWelcomeTwo = "This is a logical mind games"
                    + "\nHere B means one of your guessing numbers is inside the hidden number and in the right place"
                    + "\nHere C means one of your guessing numbers is inside the hidden number but in the wrong place";
            fraseDigOqAcha = "Enter your guess";
            fraseErroUmDig = "You entered one level number,please enter two level number";
            win = "Congratulations";
        }

        System.out.println(frasePtWelcome);
        System.out.println(frasePtWelcomeTwo);
        Random random = new Random();
        int intRandom = random.nextInt(99);// 66---100

        while (intRandom < 11) {
            intRandom++;
        }
        String s = String.valueOf(intRandom);
        char charRandom1 = s.charAt(0);
        char charRandom2 = s.charAt(1);
        while (true) {

            if (charRandom1 == charRandom2) {
                charRandom1++;
            }
            System.out.println(fraseDigOqAcha);
            String strRandom = scanner.nextLine();

            int input = Integer.parseInt(strRandom);
            if (input < 10) {
                System.out.println(fraseErroUmDig);
                continue;
            }
            char charInput = strRandom.charAt(0);
            char charInput2 = strRandom.charAt(1);

            if (input == intRandom) {
                System.out.println(win);
                return;
            } else if (charRandom1 == charInput || charRandom2 == charInput2) {
                System.out.println("1B,OC");
            } else if (charRandom1 == charInput2 && charRandom2 == charInput) {

                System.out.println("0B,2C");
            } else if (charRandom1 == charInput2 || charRandom2 == charInput) {
                System.out.println("0B,1C");
            } else {
                System.out.println("0B,0C");
            }
        }

    }
}