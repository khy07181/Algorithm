package level1;

public class 시저_암호 {
	public static String solution(String s, int n) {
		String[] str = s.split("");
		int strLen = str.length;
		String answer = "";

		for (int i = 0; i < strLen; i++) {
			if (str[i].equals(" ")) {
				answer += str[i];
				continue;
			}
			if (str[i].charAt(0) + n > 90 && str[i].charAt(0) <= 90) {
				answer += (char) (str[i].charAt(0) + n - 26);
			} else if (str[i].charAt(0) + n > 122) {
				answer += (char) (str[i].charAt(0) + n - 26);
			} else {
				answer += (char) (str[i].charAt(0) + n);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		시저_암호 test = new 시저_암호();
		System.out.println(solution("a B z", 4));
	}
}
