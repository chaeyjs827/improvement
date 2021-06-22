package test.algorithm.binaryJump;

public class BinaryJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerJump("111111"));
	}

	
	public static int powerJump(String game) {
		
		int count = 1; // 기본값은 1(초기 값), 점프 안해도 1회
		int returnCount = 0;
		
		char lastChar = game.charAt(game.length() - 1);	// 마지막 문자
		
		for(int i =0; i<game.length(); i++) {
			if(game.charAt(i) == lastChar) {
				if(count > returnCount) {
					returnCount = count;
				}
				count = 1;
			} else {
				count++;
			}
		}
		
		return returnCount;
	}
	
}
