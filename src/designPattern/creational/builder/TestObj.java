package designPattern.creational.builder;

public class TestObj {
	private String message;
	
	public TestObj(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "TestObj [message=" + message + "]";
	}
	
}
