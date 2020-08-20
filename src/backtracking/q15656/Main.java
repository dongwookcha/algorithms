package backtracking.q15656;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] a = new int[10];
    static int[] num = new int[10];
    static boolean[] c = new boolean[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num, 0, n);
        System.out.println(solution(0, n, m));
    }

    public static StringBuilder solution(int index, int n, int m) {
        StringBuilder sb = new StringBuilder();
        if(index == m) {
            for(int i = 0; i < m; i++) {
                sb.append(num[a[i]]);
                if(i != m-1) sb.append(" ");
            }
            sb.append("\n");
            return sb;
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++) {
            a[index] = i;
            ans.append(solution(index+1, n, m));
        }
        return ans;
    }
}
