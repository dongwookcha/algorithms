package graph.q1260;
import java.util.*;

public class Main {
    static int[][] a;
    static boolean[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
//        ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
        a = new int[n+1][n+1];
        c = new boolean[n+1];

//        for(int i = 1; i <= n; i++) {
//            a[i] = new ArrayList<>();
//        }

        for(int i = 1; i <= m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            a[from][to] = 1;
            a[to][from] = 1;
        }

        dfs(v, n);
        System.out.println();
        Arrays.fill(c, false);
        bfs(v, n);
    }

    public static void dfs(int v, int n) {
        c[v] = true;
        System.out.print(v + " ");
        for(int i = 1; i <= n; i++) {
            if(c[i] == false && a[v][i] == 1) {
                dfs(i, n);
            }
        }

    }

    public static void bfs(int v, int n) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(v);
        c[v] = true;

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

