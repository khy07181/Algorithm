import java.util.HashSet;
import java.util.Scanner;

public class BOJ_1920_FindNum {

	static int N, M, answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		HashSet<Integer> A = new HashSet<>();

		for (int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}

		M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			int arrM = sc.nextInt();
			if (A.contains(arrM)) {
				answer = 1;
			} else {
				answer = 0;
			}
			System.out.println(answer);
		}
	}
}
 