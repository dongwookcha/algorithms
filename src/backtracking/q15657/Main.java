package backtracking.q15657;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] a = new int[10];
    static int[] num = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num, 0, n);
        solution(0,0, n, m);
    }

    public static void solution(int index, int start, int n, int m) {
        if(index == m) {
            for(int i = 0; i < m; i++) {
                System.out.print(num[a[i]]);
                if(i != m-1) System.out.print(" ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i < n; i++) {
            a[index] = i;
            solution(index+1, i+1, n,m);
        }
    }
}

