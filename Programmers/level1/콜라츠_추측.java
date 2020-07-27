package level1;

public class 콜라츠_추측 {
	public int solution(int num) {
		int answer = 0;
		while (num != 1) {
			if (num % 2 == 0) {
				num /= 2;
				answer++;
			} else {
				num = num * 3 + 1;
				answer++;
			} 
			if(answer == 500 || num < 0) {
				answer = -1;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int num = 626331;
		콜라츠_추측 test = new 콜라츠_추측();
		System.out.println(test.solution(num));
	}
}
