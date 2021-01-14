import java.util.Scanner;

public class BOJ_1120_String {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();

		int max = 0;

		for (int i = 0; i < B.length() - A.length() + 1; i++) {
			String tempB = B.substring(i, i + A.length());
			int same = 0;
			for (int j = 0; j < tempB.length(); j++) {
				if (A.charAt(j) == tempB.charAt(j)) {
					++same;
				}
			}
			if (same > max) {
				max = same;
			}
		}
		System.out.println(A.length() - max);
	}
}
