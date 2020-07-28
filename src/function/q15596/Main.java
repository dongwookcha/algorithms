package function.q15596;

import java.util.Scanner;

public class Main {
    static int[] digitArr;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 99) {
            System.out.println(n);
            return;
        }

        for (int i = 1; i <= n; i++) {
            digitArr = makeDigit(i);

            if(isAP(digitArr)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static int[] makeDigit(int n) {
        String a = String.valueOf(n);
        int[] digit = new int[a.length()];

        for (int i = digit.length - 1; i >= 0; i--) {
            digit[i] = a.charAt(i) - 48;
        }

        return digit;
    }

    private static boolean isAP(int[] arr) {
        if (arr.length < 3) {
            return true;
        }

        return arr[1] - arr[0] == arr[2] - arr[1];
    }
}
