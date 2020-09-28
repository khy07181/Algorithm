package level1;

import java.util.Arrays;

public class 예산 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) {
				answer = i;
				break;
			} else if (budget == 0) {
				answer = i + 1;
				break;
			}
			answer++;
		}
		return answer;
	}
}
