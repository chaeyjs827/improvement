package designPattern.structual.decorator;

public class MessagnerMain {
	public static void main(String[] args) {
		Messanger messanger = new MessagnerImple();
		System.out.println(messanger.send("오늘 너무 피곤해잉"));
		
		Messanger messanger2 = new MessangerDecorator(messanger);
		System.out.println(messanger2.send("(Decorator) : 진짜 피곤하넹"));
		
		Messanger adminMessanger = new MessangerAdminDecorator(new MessangerDecorator(messanger));
		System.out.println(adminMessanger.send("오늘은 이만 자야곘다.."));
	}
}
