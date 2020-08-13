package dp.part1.q11053;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] d;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1];
        Arrays.fill(d, 1);
        a = new int[n+1];


        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 2; i <= n; i++) {
            for(int j = 1; j < i; j++) {
               if(a[i] > a[j] && d[i] < d[j]+1) {
                   d[i] = d[j] + 1;
               }
            }
        }

        int max;
        max = d[0];
        for (int i = 1; i < d.length; i++) {
            if (max < d[i]) {
                max = d[i];
            }
        }

        System.out.println(max);
    }
}