package ooComposition.Heranca.DesafioUm;

public class CarMain {

    public static void main(String[] args) {

        Ferrari f1 = new Ferrari();

        System.out.println(f1.velocidadeAtual);
        f1.acelerar();
        System.out.println(f1.velocidadeAtual);
        f1.freiar();
        System.out.println(f1.velocidadeAtual);
        f1.freiar();
        System.out.println(f1.velocidadeAtual);
    }

}
