package designPattern.behavior.observer;

public class Main {
	
	public static void main(String[] args) {
		Notice notice = new Notice();
		User1 user1 = new User1("User1");
		User2 user2 = new User2("User2");
		
		notice.attach(user1);
		notice.attach(user2);
		
		String msg = "공지사항!";
		notice.notifyObservers(msg);
		
		notice.detach(user1);
		msg = "안녕";
		notice.notifyObservers(msg);
	}
	
}
