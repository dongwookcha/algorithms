package math.p1.q1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fraction(x));
    }

    private static String fraction(int x) {
        int chunk = 1;
        int originalNum = x;
        int nth = 1;

        if (x == 1) {
            return "1/1";
        }

        for (int i = 1; i < x; i++) {
            chunk++;
            if (x > i) {
                x -= i;
                nth += i;
            } else {
                break;
            }
        }

        nth = originalNum - nth;
        String result = numerator(chunk, nth) + "/" + denominator(chunk, nth);
        return result;
    }

    private static int numerator(int n, int nth) {
        if (n % 2 == 1) {
            return n - nth;
        } else if (n % 2 == 0) {
            return 1 + nth;
        }

        return 0;
    }

    private  static int denominator(int n, int nth) {
        if (n % 2 == 1) {
            return 1 + nth;
        } else if (n % 2 == 0) {
            return n - nth;
        }
        return 0;
    }
}
