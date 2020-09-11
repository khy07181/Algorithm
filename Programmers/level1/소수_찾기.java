package level1;

public class 소수_찾기 {
	public int solution(int n) {
		int answer = 0;
		int[] intArr = new int[n + 1];

		for (int i = 2; i <= n; i++) {
			intArr[i] = i;
		}

		for (int i = 2; i <= n; i++) {
			if (intArr[i] == 0) {
				continue;
			}
			for (int j = 2; i * j <= n; j++) {
				intArr[i * j] = 0;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (intArr[i] != 0) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		소수_찾기 test = new 소수_찾기();
		int n = 100000;
		System.out.println(test.solution(n));
	}
}
