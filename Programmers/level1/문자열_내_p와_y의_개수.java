package level1;

public class 문자열_내_p와_y의_개수 {
	public static void main(String[] args) {
		System.out.println(solution("Pyy"));
	}

	static boolean solution(String s) {
		boolean answer = true;
		int pCount = 0;
		int yCount = 0;

		for (int i = 0; i <= s.length() - 1; i++) {
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				pCount++;
			}
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				yCount++;
			}
		}
		if (pCount != yCount) {
			answer = false;
		}
		return answer;
	}
}
