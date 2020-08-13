package dp.part1.q2156;

import java.util.Scanner;

public class Main {
    static int[] d;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1];
        a = new int[n+1];

        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(dp(n));
    }

    private static int dp(int n) {
        int max;
        d[1] = a[1];

        if(n >= 2) {
            d[2] = a[1] + a[2];
        }

        d[3] = Math.max(d[1] + d[3], d[2] + d[3]);

        for(int i = 4; i <= n; i++) {
            d[i] = Math.max(d[i-3] + a[i-1] + a[i], d[n-2] + a[n]);
        }

        max = d[1];
        for (int i = 2; i <= n; i++) {
            if(max < d[i]) {
                max = d[i];
            }
        }

        return max;
    }
}
