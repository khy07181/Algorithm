package level2;

import java.util.Arrays;
import java.util.Collections;

public class 최솟값_만들기 {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Integer[] B2 = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            B2[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(B2, Collections.reverseOrder());

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B2[i];
        }
        return answer;
    }
}
