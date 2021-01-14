import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14891_Gear {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] gear;

	public static void main(String[] args) throws IOException {
		String str[] = new String[2];
		gear = new int[5][8];
		for (int i = 1; i < 5; i++) {
			String gearNum = br.readLine();
			for (int j = 0; j < 8; j++) {
				gear[i][j] = gearNum.charAt(j) - '0';
			}
		}
		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			str = br.readLine().split(" ");
			int num = Integer.parseInt(str[0]);
			int dir = Integer.parseInt(str[1]);
			rotate(num, dir);
		}
		// 최종 점수 출력
		int score = gear[1][0] + gear[2][0] * 2 + gear[3][0] * 4 + gear[4][0] * 8;
		System.out.println(score);
	}

	// 시계방향 : 1, 반시계방향 : -1
	static void swap(int num, int dir) {
		if (dir == 1) {
			int tmp = gear[num][7];
			for (int i = 6; i >= 0; i--) {
				gear[num][i + 1] = gear[num][i];
			}
			gear[num][0] = tmp;
		} else {
			int tmp = gear[num][0];
			for (int i = 0; i < 7; i++) {
				gear[num][i] = gear[num][i + 1];
			}
			gear[num][7] = tmp;
		}
	}

	static void rotate(int num, int dir) {
		// 회전하기 전 톱니바퀴들의 극 판별
		// 다른 극이면 방향 바꿔서 회전
		boolean check1 = true; // 첫번째, 두번째
		boolean check2 = true; // 두번째, 세번째
		boolean check3 = true; // 세번째, 네번째
		if (gear[1][2] != gear[2][6]) {
			check1 = false;
		}
		if (gear[2][2] != gear[3][6]) {
			check2 = false;
		}
		if (gear[3][2] != gear[4][6]) {
			check3 = false;
		}
		switch (num) {
		case 1:
			if (!check1) {
				swap(2, -dir);
				int tmp = -dir;
				if (!check2) {
					swap(3, -tmp);
					tmp *= -1;
					if (!check3)
						swap(4, -tmp);
				}
			}
			swap(num, dir);
			break;
		case 2:
			if (!check1)
				swap(1, -dir);
			if (!check2) {
				swap(3, -dir);
				int tmp = -dir;
				if (!check3)
					swap(4, -tmp);
			}
			swap(num, dir);
			break;
		case 3:
			if (!check2) {
				swap(2, -dir);
				int tmp = -dir;
				if (!check1)
					swap(1, -tmp);
			}
			if (!check3)
				swap(4, -dir);
			swap(num, dir);
			break;
		default:
			if (!check3) {
				swap(3, -dir);
				int tmp = -dir;
				if (!check2) {
					swap(2, -tmp);
					tmp = -tmp;
					if (!check1)
						swap(1, -tmp);
				}
			}
			swap(num, dir);
		}
	}
}
