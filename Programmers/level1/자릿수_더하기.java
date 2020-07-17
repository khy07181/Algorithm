package level1;

public class 자릿수_더하기 {
	public int solution(int n) {
		int answer = 0;

		while (n / 10 != 0) {
			answer += n % 10;
			answer /= 10;
		}
		answer += n;

		return answer;
	}

	public static void main(String[] args) {
		자릿수_더하기 test = new 자릿수_더하기();
		System.out.println(test.solution(987));
	}
}
