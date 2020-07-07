package level2;

public class H_index {
	public int solution(int[] citations) {
		int answer = 0;
		int num = citations.length;
		boolean index = true;
		while (num > 0) {
			int check = 0;
			for (int i = 0; i < citations.length; i++) {
				if (citations[i] >= num) {
					check++;
				}
			}
			if (check >= num) {
				answer = num;
				break;
			}
			num--;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] citations = { 3, 0, 6, 1, 5 };
		H_index test = new H_index();
		System.out.println(test.solution(citations));
	}
}
