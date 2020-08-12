package dp.part1.q1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] d = new int[41][2];
        d[0][0] = 1;
        d[1][0] = 0;
        d[0][1] = 0;
        d[1][1] = 1;

        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 2; i <= n; i++) {
                for (int j = 0; j < 2; j++) {
                    d[i][j] = d[i-2][j] + d[i-1][j];
                }
            }

            System.out.println(d[n][0] + " " + d[n][1]);
        }
    }
}
