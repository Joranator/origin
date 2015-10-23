package jsneath1023;

public class Welcome {
	public static void main(String[] args) {
		NameData data = new NameData();
		
		displayGreeting();
		data.display();
		
	}
	
	private static void displayGreeting() {
		System.out.println("Hello, Welcome to the Bank of NHS!");
		System.out.println("This application allows you to choose a name to find their credit card numbers!");
		
		
	}
}
