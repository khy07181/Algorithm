import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s = sc.next();
            StringBuffer sb = new StringBuffer();
            sb.append(s);

            int score = 0;
            int total = 0;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == 'O') {
                    score++;
                    total += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(total);
        }
    }
}
