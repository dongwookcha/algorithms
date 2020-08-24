package graph.q2606;

import java.util.Scanner;

public class Main {
    static int[][] a;
    static boolean[] c;
    static int n;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        a = new int[n+1][n+1];
        c = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            a[from][to] = 1;
            a[to][from] = 1;
        }
        dfs(1);
        System.out.println(cnt-1);
    }

    public static void dfs(int x) {
        c[x] = true;
        cnt++;

        for(int i = 1; i <= n; i++) {
            if(c[i] == false && a[x][i] == 1) {
                dfs(i);
            }
        }
    }
}
