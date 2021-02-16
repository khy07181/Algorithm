import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class BOJ_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        StringBuffer sb = new StringBuffer();

        for (int value : list) {
            sb.append(value).append("\n");
        }
        System.out.println(sb.toString());
    }
}
