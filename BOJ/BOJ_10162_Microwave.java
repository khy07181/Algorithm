import java.util.Scanner;

public class BOJ_10162_Microwave {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int A = 0;
		int B = 0;
		int C = 0;

		// 300 60 10
		if (T % 10 != 0) {
			System.out.println(-1);
		} else {
			A = T / 300;
			T %= 300;

			B = T / 60;
			T %= 60;

			C = T / 10;
			T %= 10;
			System.out.println(A + " " + B + " " + C);
		}
	}
}
