package dp.part1.q16194;

import java.util.Scanner;

public class Main {
    static int[] p;
    static int[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n + 1];
        p = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            d[i] = 1000 * 10000;
            for (int j = 1; j <= i ; j++) {
                if (d[i] > d[i - j] + p[j]) {
                    d[i] = d[i - j] + p[j];
                }
            }
        }

        System.out.println(d[d.length - 1]);
    }
}
