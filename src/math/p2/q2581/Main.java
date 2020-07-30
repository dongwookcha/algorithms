package math.p2.q2581;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> primeNumberArray = new ArrayList<>();
        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                primeNumberArray.add(i);
            }
        }

        if (primeNumberArray.isEmpty()) {
            System.out.println(-1);
        } else {
            for (Integer value: primeNumberArray) {
                sum += value;
            }

            System.out.println(sum);
            System.out.println(primeNumberArray.get(0));
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
