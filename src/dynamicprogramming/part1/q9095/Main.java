package dynamicprogramming.part1.q9095;

import java.util.Scanner;

public class Main {
    public static int[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int n = sc.nextInt();
            d = new int[n + 1];
            System.out.println(dp(n));
        }

    }

    private static int dp(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (d[n] > 0) return d[n];

        d[n] = dp(n - 1) + dp(n - 2) + dp(n - 3);

        return d[n];
    }
}
