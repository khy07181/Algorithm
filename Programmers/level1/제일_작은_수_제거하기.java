package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일_작은_수_제거하기 {
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}
		int[] answer = new int[arr.length - 1];

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Arrays.sort(arr);

		list.remove(list.indexOf(arr[0]));

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		제일_작은_수_제거하기 test = new 제일_작은_수_제거하기();
		test.solution(arr);

	}
}
