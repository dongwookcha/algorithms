package graph;

import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static int[][] a;
    static Queue<Integer> q;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n+1][n+1];
        check = new boolean[n+1];

        check[1] = true;
        q.add(1);

        while(!q.isEmpty()) {
            int x = q.poll();
            for(int i=1; i<=n; i++) {
                if(a[x][i] == 1 && check[i] == false) {
                    check[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
