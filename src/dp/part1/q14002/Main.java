package dp.part1.q14002;

import java.util.Scanner;

public class Main {
    static int[] a;
    static int[] d;
    static int[] v;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        d = new int[n];
        v = new int[n];
        int max;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            d[i] = 1;
            v[i] = -1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                    v[i] = j;
                }
            }

        }


        max = d[0];
        int p = 0;
        for (int i = 1; i < d.length; i++) {
            if (max < d[i]) {
                max = d[i];
                p = i;
            }
        }

        System.out.println(max);
        list(p);
    }

    private static void list(int p) {
        if (p == -1) return;
        list(v[p]);
        System.out.print(a[p] + " ");
    }
}
