package math.p2.q1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            if(isPrime(n)) cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
