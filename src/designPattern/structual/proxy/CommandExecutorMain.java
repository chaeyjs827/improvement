package designPattern.structual.proxy;

public class CommandExecutorMain {

	public static void main(String[] args) {
		CommandExecutor ce = new CommandExecutorProxy("admin", "admin");
		try {
			ce.runCommand("ls -al");
			ce.runCommand("rm babo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
