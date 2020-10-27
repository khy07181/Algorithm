import java.util.Scanner;

public class BOJ_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		int[] alphabet = new int[26];
		word = word.toUpperCase();

		int max = 0;
		char result = '?';

		for (int i = 0; i < word.length(); i++) {
			alphabet[word.charAt(i) - 65]++;
			if (max < alphabet[word.charAt(i) - 65]) {
				max = alphabet[word.charAt(i) - 65];
				result = word.charAt(i);
			} else if (max == alphabet[word.charAt(i) - 65]) {
				result = '?';
			}
		}
		System.out.println(result);

	}
}
