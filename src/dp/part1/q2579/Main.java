package dp.part1.q2579;

import java.util.Scanner;

public class Main {
    static int[] d;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n+1];
        d = new int[n+1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(dp(n));
    }

    private static int dp(int n) {
        d[1] = a[1];

        if (n >= 2) {
          d[2] = a[1] + a[2];
        }

        for (int i = 3; i <= n; i++) {
            d[i] = Math.max(d[i-2] + a[i], d[i-3] + a[i] + a[i-1]);
        }

        return d[n];
    }
}
