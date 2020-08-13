package dp.part1.q10844;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long[][] d;
    static long mod = 1000000000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new long[101][10];

        for(int i = 1; i <= 9; i++) d[1][i] = 1;

        for(int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if(j >= 1) d[i][j] += d[i-1][j-1];
                if(j <= 8) d[i][j] += d[i-1][j+1];
                d[i][j] %= mod;
            }
        }

        long ans = 0;
        for(int i = 0; i <= 9; i++) {
            System.out.println(Arrays.toString(d[i]));
        }

        ans %= mod;
        System.out.println(ans);

    }
}
