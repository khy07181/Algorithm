class Solution {
	public int solution(int n) {
		int answer = 0;
		for(answer = n + 1; ; answer++) {
			if(count1(n) == count1(answer)) {
				break;
			}
		}
		return answer;
	}

	public int count1(int n) {
		int cnt = 0;
		while (n != 1) {
			if(n%2 != 0) {
				cnt++;
			}
			n /= 2;
		}
		return cnt;
	}
}