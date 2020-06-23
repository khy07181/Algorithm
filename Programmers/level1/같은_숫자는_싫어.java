package level1;

import java.util.ArrayList;

public class 같은_숫자는_싫어 {
	public static int[] solution(int[] arr) {
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				temp.add(arr[i]);
			}
		}
		int[] answer = new int[temp.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		return answer;
	}
}