import java.util.Scanner;

public class BOJ_1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		for (int i = 0; i < 8; i++) {
			String str = sc.next();
			if (i % 2 == 0) {
				for (int j = 0; j < 8; j += 2) {
					if (str.charAt(j) == 'F') {
						result++;
					}
				}
			} else {
				for (int j = 1; j < 8; j += 2) {
					if (str.charAt(j) == 'F') {
						result++;
					}
				}
			}
		}
		System.out.println(result);

	}
}
