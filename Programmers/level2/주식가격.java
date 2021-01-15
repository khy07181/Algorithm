package level2;

public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i =0; i< prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int result = 0;
                if(prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
                if(j == prices.length - 1) {
                    result = prices.length - i - 1;
                    answer[i] = result;
                }
            }
        }
        answer[answer.length - 1] = 0;

        return answer;
    }
}
