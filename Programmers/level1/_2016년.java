package level1;

public class _2016년 {
	public static String solution(int a, int b) {
		String answer = "";
		String[] week = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int[] day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int dayDistance = 0;
		for (int i = 0; i < a - 1; i++) {
			dayDistance += day[i];
		}
		dayDistance += b;
		answer += week[dayDistance % 7];
		return answer;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		_2016년 test = new _2016년();
		System.out.println(test.solution(a, b));
	}
}
