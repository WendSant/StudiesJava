package control;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Type a number");
        int number = Integer.parseInt(value);

        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

    }
}
