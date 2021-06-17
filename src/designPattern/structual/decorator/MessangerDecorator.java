package designPattern.structual.decorator;

public class MessangerDecorator implements Messanger {

	private Messanger messanger;
	
	public MessangerDecorator(Messanger messanger) {
		this.messanger = messanger;
	}
	
	@Override
	public String send(String msg) {
		return messanger.send(msg);
	}

}
