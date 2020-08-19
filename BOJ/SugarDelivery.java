package Greedy_Algorithm;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int bag = 0;

		while (N >= 0 && N % 5 != 0) {
			N -= 3;
			bag++;
		}
		if(N < 0) {
			System.out.println(-1);
		} else {
			bag += N/5;
			System.out.println(bag);
		}
		
	}

}
