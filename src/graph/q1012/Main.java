package graph.q1012;

import java.util.Scanner;

public class Main {
    public static final int[] dx = {0, 0, 1, -1};
    public static final int[] dy = {1, -1, 0, 0};

    public static void dfs(int[][] a, int[][] check, int i, int j, int cnt,int m, int n) {
        if(check[i][j] > 0) return;
        check[i][j] = cnt;

        for(int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(0 <= x && x < m && 0 <= y && y < n) {
                if(a[x][y] == 1 && check[x][y] == 0) {
                    dfs(a, check, x, y, cnt, m, n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[][] a = new int[m][n];
            int[][] check = new int[m][n];

            for(int i = 0; i < k; i++) {
                int row = sc.nextInt();
                int column = sc.nextInt();
                a[row][column] = 1;
            }

            int cnt = 0;
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(a[i][j] == 1 && check[i][j] == 0) {
                        dfs(a, check, i, j, ++cnt, m, n);
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
