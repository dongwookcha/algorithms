package graph.q1260;

import java.util.*;

public class Main {
    static int[][] a;
    static boolean[] c;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        a = new int[n+1][n+1];
        c = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            a[from][to] = 1;
            a[to][from] = 1;
        }

        dfs(v);
        System.out.println();
        Arrays.fill(c, false);
        bfs(v);
    }

    public static void dfs(int x) {
        c[x] = true;
        System.out.print(x + " ");

        for(int i = 1; i <= n; i++) {
            if(c[i] == false && a[x][i] == 1) {
                dfs(i);
            }
        }

    }

    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        c[x] = true;

        while(!q.isEmpty()) {
            int first = q.poll();
            System.out.print(first + " ");
            for(int i = 1; i <= n; i++) {
                if(a[first][i] == 1 && c[i] == false) {
                    q.offer(i);
                    c[i] = true;
                }
            }
        }
    }
}

