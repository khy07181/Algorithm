package level1;

import java.util.ArrayList;

public class 자연수_뒤집어_배열로_만들기 {
	public static int[] solution(long n) {
		ArrayList<Integer> temp = new ArrayList<>();
		while (n > 0) {
			temp.add((int) (n % 10));
			n /= 10;

		}
		int[] answer = new int[temp.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		자연수_뒤집어_배열로_만들기 test = new 자연수_뒤집어_배열로_만들기();
		System.out.println(test.solution(12345));
	}

}
