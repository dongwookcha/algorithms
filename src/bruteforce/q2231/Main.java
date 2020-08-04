package bruteforce.q2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int sum;

        for (int i = 1; i < n; i++) {
            sum = i;
            int k = i;
            while (k > 0) {
                sum += k % 10;

                k = k%10;
                sum += k;

                k = k / 10;
            }

            if (sum == n) {
                return i;
            }
        }

        return 0;
    }
}
