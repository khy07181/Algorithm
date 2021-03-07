import java.util.Scanner;

public class BOJ_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scale = new int[8];
        String result = "";

        for (int i = 0; i < scale.length; i++) {
            scale[i] = sc.nextInt();
        }

        for (int i = 0; i < scale.length - 1; i++) {
            if (scale[i] == scale[i + 1] + 1) {
                result = "descending";
            } else if (scale[i] == scale[i + 1] - 1) {
                result = "ascending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);

    }
}
