package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		a = 12;
		System.out.println(a);
		
		var b = 4.1;
		System.out.println(b);
		
		var c = "text";
		System.out.println(c);
		
		c = "other text";
		System.out.println(c);
		
		double d; //Declação de variavel
		d = 123.5; //Variavel iniciada
		System.out.println(d);
		
		var e = 123.5;
		System.out.println(e);
		
		var f = 12;
		
		//f = 12.1; não funciona pois a variavel foi entendida como um inteiro
		
		System.out.println(f);

	}
}
