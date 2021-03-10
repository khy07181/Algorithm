package level2;

public class JadenCase_문자열_만들기 {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();
        String[] sArr = s.split(" ");

        for (int i = 0; i < sArr.length; i++) {
            if(sArr[i].equals("")) {
                sb.append(" ");
                continue;
            }
            if (sArr[i].charAt(0) >= 97 && sArr[i].charAt(0) <= 122) {
                char first = Character.toUpperCase(sArr[i].charAt(0));
                sb.append(first);
                sb.append(sArr[i].substring(1));
            } else {
                sb.append(sArr[i]);
            }
            if (i != sArr.length - 1) {
                sb.append(" ");
            }
        }

        for(int i = 0; i < s.length() - sb.length(); i++) {
            sb.append(" ");
        }

        answer = sb.toString();
        return answer;
    }
}
