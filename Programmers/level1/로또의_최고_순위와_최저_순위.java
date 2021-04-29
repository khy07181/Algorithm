package level1;

import java.util.LinkedList;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correctCount = 0;
        int zeroCount = 0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < win_nums.length; i++) {
            list.add(win_nums[i]);
        }

        for (int i = 0; i < lottos.length; i++) {
            if (list.contains(lottos[i])) {
                correctCount++;
            }
            if (lottos[i] == 0) {
                zeroCount++;
            }
        }
        answer[0] = lotto(correctCount + zeroCount);
        answer[1] = lotto(correctCount);

        return answer;
    }

    public static int lotto(int num) {
        if (num > 1) {
            return 7 - num;
        } else {
            return 6;
        }
    }
}
