import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] intArr = new int[N];

		for (int i = 0; i < N; i++) {
			intArr[i] = sc.nextInt();
		}

		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i = N - 1; i >= 0; i--) {
			list.add(intArr[i], i + 1);
		}
		
		for(int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(list.size() - 1));
	}
}
