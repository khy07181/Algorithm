package level2;

public class 올바른_괄호 {
	boolean solution(String s) {
        boolean answer = true;
        int flag = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(flag < 0) {
        		answer = false;
        		break;
        	}
        	if(s.charAt(i) == '(') {
        		flag++;
        	} else if(s.charAt(i) == ')') {
        		flag--;
        	}
        }
        if(flag != 0) {
        	answer = false;
        }

        return answer;
    }
}
