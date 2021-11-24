package fundamentos.operators;

public class ChalLogics {
    public static void main(String[] args) {

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean buyTv50 = trabalho1 && trabalho2;
        boolean buyTv32 = trabalho1 ^ trabalho2;
        boolean buyIceCream = trabalho1 || trabalho2;

        boolean iceCream = !buyIceCream;

        System.out.println("Buy Tv 50'? " + buyTv50);
        System.out.println("Buy Tv 32'? " + buyTv32);
        System.out.println("Buy IceCream? " + buyIceCream);
        System.out.println("IceCream today? " + iceCream);

    }
}
