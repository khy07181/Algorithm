package level2;

public class N개의_최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;
        answer = arr[0];

        for (int i = 0; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
