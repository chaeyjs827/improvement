package utility.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BufferedReaderTest {

	/*
	 * 	1. Keyboard buffer에 입력 저장
	 *	2. InputStreamReader의 생성자에 필요한 인자는 표준 입력을 통해 획득( new InputStreamReader(System.in) )
	 *	3. BufferedReader의 생성자에 필요한 인자는 1번에서 생성된 InputStreamReader 인스턴스를 사용
	 *
	 *	Keyboard buffer -> inputStream -> InputStreamReader -> BufferedReader -> br.readLine()
	 *	BufferedReader 클래스에 있는 버퍼에 문자열을 저장 해놓았다가 readLine()을 통해 한 줄씩 읽어 들이는것.
	 *	
	 */
	
	public static void main(String[] args) throws IOException {
//		InputStreamReader inputStreamReader = new InputStreamReader(System.in);	// 표준 입력
//		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("d:\\textFile.txt"));	// 파일 읽기
		
		// HTTP 통신 
		URL url = new URL("https://httpbin.org/get");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}


}
