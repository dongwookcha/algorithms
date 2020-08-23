package bruteforce.q3085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.next().toCharArray();
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j+1 < n) {
                    char t = a[i][j]; a[i][j] = a[i][j+1]; a[i][j+1] = t;
                    int temp = check(a);
                    if (ans < temp) ans = temp;
                    t = a[i][j]; a[i][j] = a[i][j+1]; a[i][j+1] = t;
                }
                if(i+1 < n) {
                    char t = a[i][j]; a[i][j] = a[i+1][j]; a[i+1][j] = t;
                    int temp = check(a);
                    if (ans < temp) ans = temp;
                    t = a[i][j]; a[i][j] = a[i+1][j]; a[i+1][j] = t;
                }
            }
        }

        System.out.println(ans);
    }

    public static int check(char[][] a) {
        int max = 1;
        for(int i = 0; i < a.length; i++) {
            int cnt = 1;
            for(int j = 1; j < a.length; j++) {
                if (a[i][j] == a[i][j-1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                if(max < cnt) max = cnt;
            }

            cnt = 1;
            for(int j = 1; j < a.length; j++) {
                if(a[j][i] == a[j-1][i]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                if(max < cnt) max = cnt;
            }
        }

        return max;
    }
}
