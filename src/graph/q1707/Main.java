package graph.q1707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer>[] a;

        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            a = (ArrayList<Integer>[]) new ArrayList[n+1];
            int[] color = new int[n+1]; // 0 - 방문x, 1 - 그룹1, 2 - 그룹2

            for(int i = 1; i <= n; i++) {
                a[i] = new ArrayList<>();
            }

            for(int i = 1; i <= m; i++) {
                int v = sc.nextInt();
                int e = sc.nextInt();
                a[v].add(e);
                a[e].add(v);
            }

            boolean ok = true;
            for(int i = 1; i <= n; i++) {
                if(color[i] == 0) {
                    dfs(a, color, i, 1);
                }
            }

            for(int i = 1; i <= n; i++) {
                for(int j: a[i]) {
                    if(color[i] == color[j]) {
                        ok = false;
                    }
                }
            }

            if(ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static void dfs(ArrayList<Integer>[] a, int[] color, int node, int c) {
        color[node] = c;
        for(int i = 0; i < a[node].size(); i++) {
            int next = a[node].get(i);
            if(color[next] == 0) {
                dfs(a, color, next, 3-c);
            }
        }
    }
}
