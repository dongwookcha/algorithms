package graph.q2178;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static final int[] dx = {0, 0, 1, -1};
    public static final int[] dy = {1, -1, 0, 0};

    public static void bfs(int[][] a, int[][] acc, boolean[][] check, int i, int j, int n, int m) {
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(i, j));
        check[i][j] = true;

        while(!q.isEmpty()) {
            Pair start = q.poll();
            int x = start.x;
            int y = start.y;
            for(int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if(1 <= nx && nx <= n && 1 <= ny && ny <= m) {
                    if(a[nx][ny] == 1 && check[nx][ny] == false) {
                        q.add(new Pair(nx, ny));
                        acc[nx][ny] = acc[x][y]+1;
                        check[nx][ny] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[n+1][m+1];
        int[][] acc = new int[n+1][m+1];
        boolean[][] check = new boolean[n+1][m+1];

        for(int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            for(int j = 1; j <= m; j++) {
                a[i][j] = s.charAt(j-1) - '0';
            }
        }

        acc[1][1] = 1;
        bfs(a, acc, check, 1, 1, n, m);
        System.out.println(acc[n][m]);
    }
}
