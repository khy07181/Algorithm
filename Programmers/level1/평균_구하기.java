package level1;

public class 평균_구하기 {
	public double solution(int[] arr) {
		double answer = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		answer = (double) sum / arr.length;
		return answer;
	}

	public static void main(String[] args) {
		평균_구하기 a = new 평균_구하기();
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(a.solution(arr));
	}

}
