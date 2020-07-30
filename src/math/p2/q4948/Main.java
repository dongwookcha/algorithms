package math.p2.q4948;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while(true) {
            n = sc.nextInt();
            int cnt = 0;
            if (n == 0) {
                return;
            }

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        // n-1 까지 나누어 보는건 시간이 시간초과가 나오므로
        // sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
