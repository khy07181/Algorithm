package baekjoon;

import java.util.Scanner;

public class BOJ_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");

        int result = strArr.length;
        if(strArr[0].equals("") || strArr[strArr.length -1].equals("")) {
            result--;
        }

        System.out.println(result);
    }
}
