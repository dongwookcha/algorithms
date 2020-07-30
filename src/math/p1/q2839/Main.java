package math.p1.q2839;

import java.util.Scanner;

// Wrong answer since there is "23" counterexample.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(efficientDelivery(n));
    }

    private static int efficientDelivery(int n) {
        int result = -1;

        if (n <= 2 || n == 4 || n == 7) {
            return -1;
        }

        if (n % 5 == 0) {
            result = n / 5;
            return result;
        } else {
            for (int i = 1; i < 5000; i++) {
                for (int j = 1; j < 5000; j++) {
                    if ((5 * i) + (3 * j) == n) {
                       result = i + j;
                       return result;
                    }
                }
            }

            if(n % 3 == 0) {
                result = n / 3;
                return result;
            }
        }

        return result;
    }
}
