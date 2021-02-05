package level2;

import java.util.LinkedList;

public class 영어_끝말잇기 {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        LinkedList<String> list = new LinkedList<>();

        for(int i = 0; i < words.length; i++) {
            if(list.contains(words[i])) {
                return fail(answer, list.size(), n);
            }
            if(list.size() > 0 && words[i].charAt(0) != list.getLast().charAt(list.getLast().length() - 1)) {
                return fail(answer, list.size(), n);
            }
            if(words[i].length() == 1) {
                return fail(answer, list.size(), n);
            }

            list.add(words[i]);
        }
        answer[0] = 0;
        answer[1] = 0;


        return answer;
    }

    public static int[] fail(int [] answer, int size, int n) {
        answer[0] = size % n + 1;
        answer[1] = size / n + 1;

        return answer;
    }

}
