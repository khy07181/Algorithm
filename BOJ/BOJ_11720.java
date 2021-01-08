import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += Integer.valueOf(str.split("")[i]);
        }

        System.out.println(result);
    }
}
