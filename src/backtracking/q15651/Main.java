package backtracking.q15651;

import java.util.Scanner;

public class Main {
    static boolean[] c = new boolean[10];
    static int[] a = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        recursion(0, n, m);
    }

    public static void recursion(int index, int n, int m) {
        if(index == m) {
            for(int i = 0; i < m; i++) {
                System.out.print(a[i]);
                if(i != m -1) System.out.print(' ');
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++) {
            a[index] = i;
            recursion(index + 1, n, m);
        }
    }
}