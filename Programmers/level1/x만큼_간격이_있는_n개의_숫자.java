package level1;

import java.util.Arrays;

// 18 : 08
public class x만큼_간격이_있는_n개의_숫자 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		
		long longX = x;

		for (int i = 0; i < n; i++) {
			answer[i] = longX * (i + 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		x만큼_간격이_있는_n개의_숫자 test = new x만큼_간격이_있는_n개의_숫자();
		int x = 2;
		int n = 5;
		System.out.println(Arrays.toString(test.solution(x, n)));
	}
}
