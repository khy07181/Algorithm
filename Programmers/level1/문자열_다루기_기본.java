package level1;

public class 문자열_다루기_기본 {
	public boolean solution(String s) {
		boolean answer = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 48 || s.charAt(i) > 57) {
				answer = false;
			}
			if (s.length() != 4 && s.length() != 6) {
				answer = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		문자열_다루기_기본 a = new 문자열_다루기_기본();
		String s = ":1234567890";
		System.out.println(a.solution(s));
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(arr.length);
	}

}
