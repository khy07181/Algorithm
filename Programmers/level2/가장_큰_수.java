package level2;

import java.util.Arrays;

public class 가장_큰_수 {
	public String solution(int[] numbers) {
		String[] strNumbers = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			strNumbers[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(strNumbers, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

		if(strNumbers[0].equals("0")) {
			return "0";
		}

		String answer = "";
		for (String a : strNumbers) {
			answer += a;
		}

		return answer;
	}
}
