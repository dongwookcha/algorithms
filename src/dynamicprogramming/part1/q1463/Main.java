package dynamicprogramming.part1.q1463;

import java.util.Scanner;

// Top-Down (Recursion and Memoization)
// 함수의 호출 횟수 * 함수의 시간 복잡도
// (문제의 개수) * (문제 1개 푸는데 필요한 시간 복잡도) = N * O(1) = O(N)
public class Main {
    public static int[] d;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        d = new int[N + 1];
        System.out.println(dp(N));
    }

    private static int dp(int n) {
        if (n == 1) return 0;
        if (d[n] > 0) return d[n];

        d[n] = dp(n - 1) + 1;
        if(n % 2 == 0) {
            int temp = dp(n / 2) + 1;
            if (d[n] > temp) d[n] = temp;
        }
        if(n % 3 == 0) {
            int temp = dp(n / 3) + 1;
            if (d[n] > temp) d[n] = temp;
        }
        return d[n];
    }
}


// Bottom-Up
