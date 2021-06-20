package designPattern.creational.factoryMethod;

public class PizzaMain {

	public static void main(String[] args) {
		PizzaStore seoulStore = new PizzaSeoulStore();
		Pizza pizza1 = seoulStore.createPizza("cheese");
		
		PizzaStore seongnamStore = new PizzaSeongnamStore();
		Pizza pizza2 = seongnamStore.createPizza("cheese");
	}

}
