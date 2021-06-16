package designPattern.structual.proxy;

public class CommandExecutorImple implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		// 실제로는 Linux 환경에서 실행되는 메모리 부하를 발생시킬 수 있는 작업
		System.out.println("cmd : " + cmd);
	}

}
