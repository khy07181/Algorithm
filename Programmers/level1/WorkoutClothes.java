class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
			for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
				if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		return n - lost.length + answer;
	}
}