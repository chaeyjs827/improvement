package test.algorithm.binaryJump;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(solution("abacjjjdf"));
		System.out.println(solution2("sdflkjaba"));
	}

	public static int solution(String s) {
		int answer = 0;

		char[] charArr = s.toCharArray();

		// 가장 긴 문자열을 찾기 위해 length를 기준으로 -- 처리 함
		for (int strLength = s.length(); strLength > 1; strLength--) {
			//
			for (int start = 0; start + strLength <= s.length(); start++) {
				boolean check = true;
				for (int i = 0; i < strLength / 2; i++) {
					if (charArr[start + i] != charArr[start + strLength - i - 1]) {
						check = false;
						break;
					}
				}
				if (check) {
					return strLength;
				}
			}
		}

		return answer;
	}

	public static int solution2(String s) {
		String reverStr = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			reverStr += s.charAt(i);
		}

		int digits = 1;
		for (int i = 2; i <= s.length(); i++) {
			for (int j = 0; j <= s.length() - i; j++) {
				if (reverStr.contains(s.substring(j, j + i))) {
					digits = i;
					break;
				}
			}
		}
		return digits;
	}
}
