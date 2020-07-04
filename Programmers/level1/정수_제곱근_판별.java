package level1;

public class 정수_제곱근_판별 {
	public long solution(long n) {
		long answer = -1;
		for (long i = 1; i < 10000000; i++) {
			if (n == i * i) {
				answer = (i + 1) * (i + 1);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		정수_제곱근_판별 test = new 정수_제곱근_판별();
		System.out.println(test.solution(121));
	}
}
