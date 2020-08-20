package backtracking.q15651;

import java.util.Scanner;

public class Main {
    static boolean[] c = new boolean[10];
    static int[] a = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(recursion(0, n, m));
    }

    public static StringBuilder recursion(int index, int n, int m) {
        StringBuilder sb = new StringBuilder();

        if(index == m) {
            for(int i = 0; i < m; i++) {
                sb.append(a[i]);
                if(i != m -1) sb.append(' ');
            }
            sb.append('\n');
            return sb;
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            a[index] = i;
            ans.append(recursion(index + 1, n, m));
        }
        return ans;
    }
}