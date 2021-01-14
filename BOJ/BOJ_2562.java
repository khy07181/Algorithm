import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int max = 0;

        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            list.add(num);
        }
        System.out.println(max);
        System.out.println(list.indexOf(max) + 1);
    }
}
