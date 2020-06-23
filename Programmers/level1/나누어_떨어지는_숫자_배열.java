package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> temp = new ArrayList<>();
		int arrLen = arr.length;
		for (int i = 0; i < arrLen; i++) {
			if (arr[i] % divisor == 0) {
				temp.add(arr[i]);
				System.out.println(arr[i]);
			}
		}
		if (temp.size() == 0) {
			temp.add(-1);
		}
		int[] answer = new int[temp.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		나누어_떨어지는_숫자_배열 test = new 나누어_떨어지는_숫자_배열();
		int [] arr = {5, 9 ,7, 10};
		System.out.println(test.solution(arr, 5)[0]);
	}
}
