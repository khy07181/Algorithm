package level1;

public class 이상한_문자_만들기 {
	public static String solution(String s) {
		String answer = "";
		String[] str = s.split("");
		int index = 0;
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals(" ")) {
				index = 0;
			} else {
				if(index % 2 == 0) {
					str[i] = str[i].toUpperCase();
					index ++;
				} else {
					str[i] = str[i].toLowerCase();
					index ++;
				}
			}
			answer += str[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		이상한_문자_만들기 test = new 이상한_문자_만들기();
		String s = "try hello world";
		System.out.println(test.solution(s));
	}

}
