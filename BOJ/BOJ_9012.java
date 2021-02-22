import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] strArr = br.readLine().split("");
            Stack<String> st = new Stack<>();

            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals("(")) {
                    st.add(strArr[j]);
                } else {
                    if (st.size() == 0) {
                        st.add(strArr[j]);
                        break;
                    }
                    if (st.peek().equals("(")) {
                        st.pop();
                    } else {
                        st.add(strArr[j]);
                    }
                }
            }
            if (st.size() == 0) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
