package bruteforce.q7568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }


        for (int i = 0; i < x.length ; i++) {
            for (int j = 0; j < y.length; j++) {
                if (i == j) continue;

                if((x[i] < x[j]) && (y[i] < y[j])) {
                    result[i]++;
                }
            }
        }

        for (int value: result) {
            System.out.print((value + 1) + " ");
        }

    }
}
