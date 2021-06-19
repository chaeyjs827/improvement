package designPattern.creational.builder;

public class TestBuilder {
	
	private String message;
	
	public TestBuilder setMessage(String message) {
		this.message = message;
		return this;
	}
	
	public TestObj build() {
		return new TestObj(message);
	}
}
