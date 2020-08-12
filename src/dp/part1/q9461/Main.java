package dp.part1.q9461;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] d = new long[101];

        d[1] = 1;
        d[2] = 1;
        d[3] = 1;

        for (int i = 4; i < 101; i ++) {
            d[i] = d[i-3] + d[i-2];
        }

        int T = sc.nextInt();

        while(T-- > 0) {
            int n = sc.nextInt();
            System.out.println(d[n]);
        }

    }
}
