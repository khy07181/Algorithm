package level2;

public class 숫자의_표현 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int num = 0;

        while(sum <= n) {
            num++;
            sum += num;
        }
        for(int i = 3; i < num; i++) {
            sum = 0;
            for(int j = 1; j <= i; j++) {
                sum += j;
            }
            if((n - sum)%i == 0) {
                answer++;
            }
        }

        if(n %2 ==0) {
            answer++;
        } else {
            answer += 2;
        }
        return answer;
    }
}
