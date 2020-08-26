package graph.q7562;

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
    public static final int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    public static final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int destinationX = sc.nextInt();
            int destinationY = sc.nextInt();

            int[][] a = new int[n][n];
            int[][] dist = new int[n][n];
            Queue<Pair> q = new LinkedList<Pair>();
            a[startX][startY] = 1;
            q.add(new Pair(startX, startY));

            while(!q.isEmpty()) {
                Pair start = q.poll();
                int x = start.x;
                int y = start.y;
                for(int i = 0; i < 8; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                        if (a[nx][ny] == 0 && dist[nx][ny] == 0) {
                            q.add(new Pair(nx, ny));
                            dist[nx][ny] = dist[x][y] + 1;
                        }
                    }
                }
            }

            System.out.println(dist[destinationX][destinationY]);
        }
    }
}
