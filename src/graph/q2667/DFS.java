package graph.q2667;

import java.util.Arrays;
import java.util.Scanner;

public class DFS {
    public static final int[] dx = {0, 0, -1, 1};
    public static final int[] dy = {1, -1, 0, 0};

    public static void bfs(int[][] a, int[][] group, int i, int j, int cnt, int n) {
        if(group[i][j] > 0) return;
        group[i][j] = cnt;

        for(int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(0 <= x && x < n && 0 <= y && y < n) {
                if(a[x][y] == 1 && group[x][y] == 0) {
                    bfs(a, group, x, y, cnt, n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[][] a = new int[n][n];
        int[][] group = new int[n][n];

        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for(int j = 0; j < n; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(a[i][j] == 1 && group[i][j] == 0) {
                    bfs(a, group, i, j, ++cnt, n);
                }
            }
        }

        int[] ans = new int[cnt];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(group[i][j] != 0) {
                    ans[group[i][j]-1]++;
                }
            }
        }

        System.out.println(cnt);
        Arrays.sort(ans);
        for(int value: ans) System.out.println(value);
    }
}
