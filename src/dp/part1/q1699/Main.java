package dp.part1.q1699;

import java.util.Scanner;

public class Main {
    static int[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n + 1];

        for (int i=1; i<=n; i++) {
            d[i] = i;
            for (int j=1; j*j <= i; j++) {
                if (d[i] > d[i-j*j]+1) {
                d[i] = d[i-j*j]+1;
                }
            }
        }

        System.out.println(d[d.length - 1]);
    }
}
