package dp.part1.q1932;

import java.util.Scanner;

public class Main {
    static int[][] d;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1][n+1];
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i][j] = sc.nextInt();

                if(j == 1) d[i][j] += d[i-1][j];
                else if(j == i) d[i][j] += d[i-1][j-1];
                else d[i][j] = Math.max((d[i][j] + d[i-1][j]), (d[i][j] + d[i-1][j-1]));

                if (sum < d[i][j]) sum = d[i][j];
            }
        }

        System.out.println(sum);
    }
}
