package dp.part1.q2748;

import java.util.Scanner;

public class Main {
    static long[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new long[n+1];
        System.out.println(fib(n));
    }

    private static long fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            if (d[n] > 0) {
                return d[n];
            }

            d[n] = fib(n-1) + fib(n-2);
            return d[n];
        }
    }
}
