package Simulation;

import java.util.Scanner;

public class BOJ_2455_IntelligenTrain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int minus[] = new int[4];
		int plus[] = new int[4];

		for (int i = 0; i < 4; i++) {
			minus[i] = scanner.nextInt();
			plus[i] = scanner.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int people = plus[0];

		for (int i = 1; i < 4; i++) {
			people -= minus[i];
			people += plus[i];
			if (people > max) {
				max = people;
			}
		}
		System.out.println(max);
	}
}
