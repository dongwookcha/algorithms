package dp.part1.q1904;

import java.util.Scanner;

public class Main {
    static long[] d;
    static int mod = 15746;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new long[n+1];

        System.out.println(dp(n));
    }

    private static long dp(int n) {
        if (n <= 2) {
            return n;
        }

        d[1] = 1;
        d[2] = 2;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i-1] + d[i-2])%mod;
        }

        return d[n];
    }
}
