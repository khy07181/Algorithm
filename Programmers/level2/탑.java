package level2;

public class 탑 {
	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		answer[0] = 0;
		for (int i = 1; i < heights.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (heights[i] < heights[j]) {
					answer[i] = j + 1;
				} else {
					answer[i] = 0;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int [] heights = {6, 9, 5, 7, 4}; 
		탑 test = new 탑();
		for(int i = 0; i <heights.length; i++) {
			System.out.println(test.solution(heights)[i]);
		}
	}
}
