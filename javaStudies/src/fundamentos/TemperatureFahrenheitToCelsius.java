package fundamentos;


public class TemperatureFahrenheitToCelsius {
		public static void main(String[] args) {
			double fahren, celsius;
			final double divider = 5.0/9;
			final double adjust = -32;
			fahren = 50;
			celsius = ((fahren + adjust) * divider);
			System.out.println("\n ================== \n");
			System.out.println("FAHRENHEIT PARA CELSIUS");
			System.out.println("\n ================== \n");
			System.out.println("Os graus em celsius é: "+celsius+"ºC.");
		}
}
