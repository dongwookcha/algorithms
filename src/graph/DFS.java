package graph;

import java.util.*;

public class DFS {
    static int[][] a; // for adjacent matrix
    static ArrayList<Integer>[] g; // for adjacent list
    static boolean[] check;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1][n+1];
        g = (ArrayList<Integer>[])  new ArrayList[n];
        check = new boolean[n+1];

        for(int i = 1; i < n; i++) {

        }

    }

    // use Adjacent Matrix
    public static void DFS_M(int x) {
        check[x] = true;
        for(int i = 0; i <= n; i++) {
            if(a[x][i] == 1 && check[i] == false) {
                DFS_M(i);
            }
        }
    }

    // use Adjacent List
    public static void DFS_L(int x) {
        check[x] = true;
        for(int i = 0; i < g[x].size(); i++) {
            int y = a[x][i];
            if(check[y] == false) {
                DFS_L(y);
            }
        }
    }
}
