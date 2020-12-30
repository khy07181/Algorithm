package baekjoon;

import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];
        double max = 0;
        double total = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < N; i++) {
            score[i] = score[i] / max * 100;
            total += score[i];
        }

        System.out.println(total / N);
    }
}
