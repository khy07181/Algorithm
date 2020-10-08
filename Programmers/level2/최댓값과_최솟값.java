package level2;

import java.util.Arrays;

public class 최댓값과_최솟값 {
	public String solution(String s) {
		String answer = "";
		String[] strArr = s.split(" ");
		int[] intArr = new int[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(intArr);

		answer += intArr[0] + " " + intArr[intArr.length - 1];
		return answer;
	}

	public static void main(String[] args) {
		최댓값과_최솟값 test = new 최댓값과_최솟값();
		String s = "1 2 3 4";
		System.out.println(test.solution(s));
	}
}
