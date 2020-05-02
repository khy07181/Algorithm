package level1;

public class 같은_숫자는_싫어 {
	public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i < n/2 + 1; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        answer += n;
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution(12));
	}
}