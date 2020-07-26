package math.p1.q2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        if (n == 1) {
            return 1;
        }

        int result = 1;
        int sum = 2;

        while (n >= sum) {
            sum += 6 * result;
            result++;
        }

        return result;
    }
}