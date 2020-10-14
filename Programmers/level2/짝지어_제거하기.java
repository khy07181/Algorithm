package level2;

import java.util.Stack;

public class 짝지어_제거하기 {
	public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
         
        for(char c : s.toCharArray()) 
          if(!stack.isEmpty() && stack.peek() == c) stack.pop();
          else stack.push(c);
         
        return stack.isEmpty() ? 1 : 0;
    }

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		짝지어_제거하기 test = new 짝지어_제거하기();
		String s = "baabaa";
		System.out.println(test.solution(s));
	}
}
