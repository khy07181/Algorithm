package level2;

import java.util.Arrays;

public class 전화번호_목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length - 1; i++) {
            int len = Math.min(phone_book[i].length(), phone_book[i+1].length());
            if(phone_book[i].substring(0, len).equals(phone_book[i + 1].substring(0, len))) {
                answer = false;
                break;
            }
        }
        return answer;
    }

}
