import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);

        String[] strArr = br.readLine().split(" ");
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(trees);
        long start = 0;
        long end = trees[trees.length - 1];

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            if (sum >= M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);

    }
}
