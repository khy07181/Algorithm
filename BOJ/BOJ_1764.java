import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        HashSet<String> set = new HashSet<>();
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }
        for (int i = 0; i < M; i++) {
            String str = sc.next();
            if (set.contains(str)) {
                count++;
                list.add(str);
            }
        }
        Collections.sort(list);

        System.out.println(count);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
