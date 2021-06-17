package designPattern.structual.decorator;

public class MessangerAdminDecorator extends MessangerDecorator{

	public MessangerAdminDecorator(Messanger messanger) {
		super(messanger);
	}
	
	@Override
	public String send(String msg) {
		return super.send("[ADMIN MESSAGE]" +  msg);
	}

}
