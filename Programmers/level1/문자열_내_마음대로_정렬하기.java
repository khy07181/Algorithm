package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열_내_마음대로_정렬하기 {
	public String[] solution(String[] strings, int n) {
		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			temp.add("" + strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(temp);
		String[] answer = new String[strings.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i).substring(1, temp.get(i).length());
		}

		return answer;
	}

	public static void main(String[] args) {
		String [] strings = {"abce", "abcd", "cdx"};
		문자열_내_마음대로_정렬하기 test = new 문자열_내_마음대로_정렬하기();
		for(int i = 0; i < strings.length; i++) {
			System.out.println(test.solution(strings, 2)[i]);
		}
	}
}
