package dp.part1.q11727;

import java.util.Scanner;

public class Main {
    public static int[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n + 1];
        System.out.println(dp(n));
    }

    private static int dp(int n) {
        if (n == 1) return 1;
        if (n == 2) return 3;
        if (d[n] > 0) return d[n];

        d[n] = dp(n - 1) + 2 * dp(n - 2);
        d[n] %= 10007;

        return d[n];
    }
}