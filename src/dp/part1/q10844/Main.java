package dp.part1.q10844;

import java.util.Scanner;

public class Main {
    static int[][] d = new int[101][10];
    static long mod = 1000000000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) d[1][i] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                d[i][j] = 0;
                if (j >= 1) d[i][j] = d[i-1][j-1] + d[i][j];
                if (j <= 8) d[i][j] = d[i-1][j+1] + d[i][j];
                d[i][j] %= mod;
            }
        }
        long ans = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.println(ans);
            ans += d[n][i];
        }
        ans %= mod;
        System.out.println(ans);
    }
}
