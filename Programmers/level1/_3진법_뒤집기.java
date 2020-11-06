package level1;

import java.util.Stack;

public class _3진법_뒤집기 {
	public int solution(int n) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();

		while (n != 0) {
			int remain = n % 3;
			n /= 3;
			st.push(remain);
		}

		int stackSize = st.size();

		for (int i = 0; i < stackSize; i++) {
			answer += st.pop() * Math.pow(3, i);
		}

		return answer;
	}
}
