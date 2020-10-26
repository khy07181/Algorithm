import java.util.Scanner;

public class BOJ_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}

		for (int i = 0; i < S.length(); i++) {
			if (alphabet[S.charAt(i) - 97] == -1) {
				alphabet[S.charAt(i) - 97] = i;
			}
		}

		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}
