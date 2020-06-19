package level1;

public class 수박 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(4));
	}

}
class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
}