package recursion.q14051;

import java.util.Scanner;

public class Main {
    static int[] t;
    static int[] p;
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        t = new int[n + 1];
        p = new int[n + 1];


        for(int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        solution(1, 0, n);

        System.out.println(ans);
    }

    public static void solution(int day, int sum, int n) {
        if(n+1 == day) {
            if(ans < sum) {
                System.out.println("ans: " + ans);
                System.out.println("sum: " + sum);
                ans = sum;
            }
            return;
        }
        if(n+1 < day) return;

        solution(day + t[day], sum + p[day], n);
        solution( day+1, sum, n);
    }
}
