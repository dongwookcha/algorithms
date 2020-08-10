package dp.part1.q1912;

import java.util.Scanner;

public class Main {
    static int a[]; // storage
    static int d[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        d = new int[n];
        int max;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            d[i] = a[i];
            if (i == 0) continue;
            if (d[i] < d[i - 1] + a[i]) {
                d[i] = d[i - 1] + a[i];
            }
        }

        max = d[0];
        for (int i = 1; i < d.length; i++) {
            if (max < d[i]) {
                max = d[i];
            }
        }

        System.out.println(max);
    }

}
