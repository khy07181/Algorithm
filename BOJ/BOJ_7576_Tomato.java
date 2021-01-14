import java.io.*;
import java.util.*;

public class BOJ_7576_Tomato {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int M = Integer.parseInt(str[0]);
		int N = Integer.parseInt(str[1]);

		int[][] box = new int[N][M];

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(str[j]);

			}
		}
		BFS(box, N, M);
	}

	public static void BFS(int[][] box, int N, int M) {
		Queue<Point_1> queue = new LinkedList<Point_1>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 1)
					queue.add(new Point_1(i, j));
			}
		}

		while (!queue.isEmpty()) {
			Point_1 Point_1 = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = Point_1.x + dx[i];
				int nextY = Point_1.y + dy[i];

				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				if (box[nextX][nextY] != 0) {
					continue;
				}
				box[nextX][nextY] = box[Point_1.x][Point_1.y] + 1;
				queue.add(new Point_1(nextX, nextY));
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, box[i][j]);
			}
		}
		System.out.println(max - 1);

	}
}

class Point_1 {
	int x;
	int y;

	Point_1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}