package fundamentos;

import javax.swing.JOptionPane;

public class ConversionStringToNumber {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Type a number");
        String valor2 = JOptionPane.showInputDialog("Type other number");

        double number1 = Double.parseDouble(valor1);
        double number2 = Double.parseDouble(valor2);

        double sum = number1 + number2;
        System.out.println("A soma é " + sum);
        System.out.println("A media é " + sum / 2);
    }
}
