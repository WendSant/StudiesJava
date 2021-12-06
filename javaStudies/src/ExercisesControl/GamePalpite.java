
package ExercisesControl;

import java.util.Random;
import java.util.Scanner;

public class GamePalpite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String language = "";
        String fraseWelcome = "", fraseWelcomeTwo = "", frasePalpite = "", fraseErroUmDig = "", win = "";

        while (!language.equalsIgnoreCase("pt") || !language.equalsIgnoreCase("en")) {
            System.out.println("Type language en or pt(Digite a linguagem en ou pt)");
            language = scanner.nextLine();
            if (language.equalsIgnoreCase("pt") || language.equalsIgnoreCase("en")) {
                break;
            }
            System.out.println("\nEnter a valid language(Digite uma lingua válida)");

        }

        if (language.equalsIgnoreCase("pt")) {
            fraseWelcome = "Bem-vindo ao jogo Bulls and Cows";
            fraseWelcomeTwo = "Este é um jogo mental lógico"
                    + "\nNeste game a letra B significa que um dos seus palpites está dentro do número escondido e no lugar certo"
                    + "\ne a letra C significa que um dos seus palpites está dentro do número escondido mas no lugar errado";
            frasePalpite = "Digite seu palpite";
            fraseErroUmDig = "Você inseriu um numero de um digito(0 a 9), por favor digite um número de dois digitos (10 a 99)";
            win = "Parabéns você ganhou!";

        } else if (language.equalsIgnoreCase("en")) {
            fraseWelcome = "Welcome to the Bulls and Cows game!";
            fraseWelcomeTwo = "This is a logical mind games"
                    + "\nHere B means one of your guessing numbers is inside the hidden number and in the right place"
                    + "\nHere C means one of your guessing numbers is inside the hidden number but in the wrong place";
            frasePalpite = "Enter your guess";
            fraseErroUmDig = "You entered one level number,please enter two level number";
            win = "Congratulations";
        }

        System.out.println(fraseWelcome);
        System.out.println(fraseWelcomeTwo);
        Random random = new Random();
        int intRandom = random.nextInt(99);
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
            System.out.println(frasePalpite);
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
                scanner.close();
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