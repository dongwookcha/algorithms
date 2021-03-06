package dp.part1.q1149;

import java.util.Scanner;

public class Main {
    static int[][] d;
    static int[][] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        d = new int[n+1][3];
        a = new int[n+1][3];

        for(int i = 1; i <= n; i++) {
            // i = 집의 수 && j = 색
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= n; i++) {
            d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + a[i][0];
            d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + a[i][1];
            d[i][2] = Math.min(d[i-1][1], d[i-1][0]) + a[i][2];
        }

        System.out.println(Math.min(Math.min(d[n][0], d[n][1]), d[n][2]));
    }
}
