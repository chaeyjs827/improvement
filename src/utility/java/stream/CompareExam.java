package utility.java.stream;

public class CompareExam {
	
	/*
	 *		메소드명((매개변수 목록) -> {
	 *			return 값;
	 *		});
	 *		
	 *		람다는 
	 */
	
	public static void main(String[] args) {
		exec((i,j) -> {
			System.out.println("이 부분은 뭐지...");
			return i-j;
		});
	}
	
	public static void exec(Compare compare) {
		int k = 10;
		int m = 20;
		int value = compare.compareTo(k, m);
		System.out.println("value : " + value);
	}

	public static void inputExce(int i, int j)  {
		int value = (i + j);
		System.out.println("value : " + value);
	}
	
}
