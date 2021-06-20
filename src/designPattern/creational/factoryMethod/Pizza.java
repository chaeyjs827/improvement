package designPattern.creational.factoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Put a dough");
		System.out.println("Added a sauce");
		System.out.println("Added toppings");
		for(String str : toppings) {
			System.out.println("  Topping : " + str);
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 mintues");
	}
	
	void cut() {
		System.out.println("Cutting pizza");
	}
	
	void box() {
		System.out.println("Packing");
	}
	
	public String getName() {
		return this.name;
	}
}
