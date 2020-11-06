package level1;

public class 최대공약수와_최소공배수 {
	public int[] solution(int a, int b) {
		int[] answer = new int[2];
		int temp = 1;
		int gcd = a * b;

		while (temp != 0) {
			temp = b % a;
			b = a;
			a = temp;
		}

		answer[0] = b;
		answer[1] = gcd / b;
		return answer;
	}

	public static void main(String[] args) {
		최대공약수와_최소공배수 test = new 최대공약수와_최소공배수();
		System.out.println(test.solution(3, 12)[0] + " " + test.solution(3, 12)[1]);
	}
}
