package fundamentos;

public class TypeString {
	public static void main(String[] args) {
		System.out.println("Hello guys".charAt(2));
		
		String s = "Good afternoon";
		System.out.print(s.concat("!"));
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Good"));
		System.out.println(s.toLowerCase().startsWith("good"));
		System.out.println(s.toUpperCase().endsWith("AFTERNOON"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("good afternoon"));
		System.out.println(s.equalsIgnoreCase("good afternoon"));
		
		var name = "Will";
		var lastname = "John";
		var age = 22;
		var salary = 1111.2544;
		
		String moreOnePhrase = "Name: " + name + "\nLastname: "+ lastname + "\nAge: "+ age + "\nSalary: "+ salary;
		System.out.println(moreOnePhrase);
		
		
		System.out.printf("The sir %s %s is %d years old and has a salary of R$%.2f", name, lastname, age, salary);
		
		String Phrase = String.format("\nThe sir %s %s is %d years old and has a salary of R$%.2f", name, lastname, age, salary);
		System.out.println(Phrase);
		
		System.out.println("any phrase".contains("any"));
		System.out.println("any phrase".indexOf("any"));
		System.out.println("any phrase".substring(6));
		System.out.println("any phrase".substring(4,8));
		
		
	}
}
