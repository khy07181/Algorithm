package Step9;

import java.util.Scanner;

public class ACM_Hotel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int H = scanner.nextInt(); // ��
			int W = scanner.nextInt(); // ��
			int N = scanner.nextInt(); // ���°
			int h, w;

			if (N % H != 0) {
				h = N % H;
				w = N / H + 1;
			} else {
				h = N;
				w = N / H;
			}
			System.out.println(100 * h + w);
		}

	}
}
