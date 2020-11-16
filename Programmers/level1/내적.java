package level1;

public class 내적 {
	public int solution(int[] a, int[] b) {
		int answer = 1234567890;

		int dot_product = 0;

		for (int i = 0; i < a.length; i++) {
			dot_product += a[i] * b[i];
		}
		answer = dot_product;

		return answer;
	}
}
