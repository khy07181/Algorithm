package level1;

import java.util.ArrayList;

public class 모의고사 {
	public static ArrayList<Integer> solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] st1 = { 1, 2, 3, 4, 5 };
		int[] st2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] st3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] score = {0, 0, 0};
		int max = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == st1[i % 5]) {
				score[0]++;
			}
			if (answers[i] == st2[i % 8]) {
				score[1]++;
			}
			if (answers[i] == st3[i % 10]) {
				score[2]++;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		for (int i = 0; i < 3; i++) {
			if (score[i] == max) {
				answer.add(i + 1);
			}
		}
		return answer;

	}
}
