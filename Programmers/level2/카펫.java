package level2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int n = 1;

        while (n * n <= sum) {
            if (n * n == sum) {
                answer[0] = n;
                answer[1] = n;
                return answer;
            }
            n++;
        }
        int v = n - 1;
        int h = n - 1;

        while (v * h != sum) {
            v++;
        }
        answer[0] = v;
        answer[1] = h;

        return answer;
    }
}
