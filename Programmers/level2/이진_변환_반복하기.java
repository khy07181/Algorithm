package level2;

public class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() != 1) {
            int oneCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    oneCount++;
                }
            }
            s = Integer.toBinaryString(oneCount);
            answer[0]++;
        }

        return answer;
    }
}
