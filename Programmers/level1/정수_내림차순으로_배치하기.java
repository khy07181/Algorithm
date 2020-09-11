package level1;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
	public long solution(long n) {
		long answer = 0;
		
		String num = String.valueOf(n);
		String[] numArr = num.split("");
		Arrays.sort(numArr);

		num = "";
		
		for (int i = numArr.length - 1; i >= 0; i--) {
			num += numArr[i];
		}
		
		answer = Long.valueOf(num);

		return answer;

	}
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		정수_내림차순으로_배치하기 test = new 정수_내림차순으로_배치하기();
		System.out.println(test.solution(118372));
	}

}
