package designPattern.structual.proxy;

public class NaverMailSender implements MailSender{

	@Override
	public void send(String message, String type) {
		System.out.println("[SEND by NAVER] : " + message);
	}

}
