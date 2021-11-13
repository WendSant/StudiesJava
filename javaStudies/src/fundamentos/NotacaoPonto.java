package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Good morning X";
		s = s.replace("X", "Mrs");
		s = s.toUpperCase();
		s = s.concat("!");
		System.out.println(s);
		String div = "================";
		System.out.println(div);
		
		String x = "Brandon".toUpperCase();
		System.out.println(x);
		System.out.println(div);
		
		String y = "Good morning X"
				.replace("X", "Padgett")
				.toUpperCase() 
				.concat("!!!");
		System.out.println(y);
		
		//Types primitives dont have operator
		int a =3;
		System.out.println(a);
				
		
	}
}
