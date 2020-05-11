package level1;

public class 가운데_글자_가져오기 {
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		} else {
			answer += s.charAt(s.length()/2);
		}
		return answer;
	}

	public static void main(String[] args) {
		가운데_글자_가져오기 a = new 가운데_글자_가져오기();
		String s = "qwer";
		System.out.println(a.solution(s));
	}

}
