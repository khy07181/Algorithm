import java.util.Scanner;

public class BOJ_2979_TruckParking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		int[] truck = new int[100];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int price = 0;

		for (int i = 0; i < 3; i++) {
			int start = scanner.nextInt();
			int end = scanner.nextInt();

			if (start < min) {
				min = start;
			}
			if (end > max) {
				max = end;
			}

			for (int j = start; j < end; j++) {
				truck[j]++;
			}
		}

		for (int i = min; i < max; i++) {
			switch (truck[i]) {
			case 1:
				price += A * truck[i];
				break;
			case 2:
				price += B * truck[i];
				break;
			case 3:
				price += C * truck[i];
				break;
			}
		}
		System.out.println(price);
	}

}
