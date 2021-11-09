package fundamentos;


public class TemperatureFahrenheitToCelsius {
		public static void main(String[] args) {
			double divider, adjust, fahren, celsius;
			divider = 5.0/9;
			adjust = -32;
			fahren = 50;
			celsius = ((fahren + adjust) * divider);
			System.out.println("\n ================== \n");
			System.out.println("FAHRENHEIT PARA CELSIUS");
			System.out.println("\n ================== \n");
			System.out.println(celsius);
		}

}
