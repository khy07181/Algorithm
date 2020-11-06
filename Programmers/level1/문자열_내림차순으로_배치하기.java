package level1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {
	public String solution(String s) {
		String answer = "";

		String[] sArr = s.split("");
		Arrays.sort(sArr);

		for (int i = sArr.length - 1; i >= 0; i--) {
			answer += sArr[i];
		}

		return answer;
	}
}
