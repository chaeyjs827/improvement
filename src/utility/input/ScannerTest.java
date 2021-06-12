package utility.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest {
	
	/*
	 *  Scanner는 BufferedReader와 속도 차이가 있음.
	 *  Scanner는 문자열 입력이 키를 누르는 즉시 발생함(IO에 직접 접근)
	 *  BufferedReader는 키의 입력이 있을때 한 글자씩 버퍼에 전송. 버퍼가 가득차거나 개행문자가 있을떄까지 모았다가 전송.(버퍼를 통해 IO에 접근)
	 *  
//	 *  System.in의 in은 InputStream을 쓰는것
	 *  
	 * sc.next()		: 공백 발생 이전까지 입력 받음
	 * sc.nextLine()	: 한 줄 전체를 입력 받음
	 * sc.nextInt()		: int형 입력
	 * sc.next*			: *형 입력
	 */
	
	public static void main(String[] args) {
		String str = "hashNextLine()는 현재 입력된 토큰이 있으면 true를 반환하고, 새로운 입력이 있을 때 까지 무한정 대기.\n 그리고 새로운 입력이 들어오면 다시 true를 반환.\n ctrl+z 키가 입력되면 입력이 종료되므로 false 리턴.\n";

		//	Scanner sc = new Scanner(System.in); // System.in을 사용하면 직접 입력 받을 수 있음
		//	Scanner sc = new Scanner(new File("textFile.txt")); // 텍스트 파일을 직접 읽어올 수 있음
		Scanner sc = new Scanner(str);	// 문자열을 직접 읽어올 수 있음
		
		List<String> list = new ArrayList<>();
		
		while(sc.hasNextLine()) {	// 다음 라인이 존재하면 true, 존재하지 않으면 false를 반환해 종료
			String tempStr = sc.nextLine();
			list.add(tempStr);
 			System.out.println(tempStr);
		}
		
		for(String element : list) {
			System.out.println("Result : " + element);
		}
	}

}
