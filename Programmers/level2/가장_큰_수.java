package level2;

import java.util.Arrays;

public class 가장_큰_수 {
	public String solution(int[] numbers) {
		String[] strArr = new String[numbers.length];

		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = Integer.toString(numbers[i]);
		}

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		String answer = "";

		for (int i = strArr.length - 1; i >= 0; i--) {
			answer += strArr[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		int [] numbers = {6, 10 ,2};
		가장_큰_수 test = new 가장_큰_수();
		System.out.println(test.solution(numbers));
	}
}
