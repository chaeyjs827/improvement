package designPattern.creational.factoryMethod;

public class TelecomMain {
	public static void main(String[] args) {
		TelecomStore ts1 = new TelecomFactory().createTelecomStore("Uplus");
		ts1.create();
		
		TelecomFactory telecomFactory = new TelecomFactory();
		
		TelecomStore ts3 = telecomFactory.createTelecomStore("SK");
		TelecomStore ts4 = telecomFactory.createTelecomStore("Uplus");
		ts3.create();
		ts4.create();
		
	}
}
