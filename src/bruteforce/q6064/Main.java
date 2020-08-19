package bruteforce.q6064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            solution(M, N, x, y);
        }
    }

    private static void solution(int M, int N, int x, int y) {
        x -= 1;
        y -= 1;
        boolean ok = false;

        for(int i = x; i < (M*N); i += M) {
            if(i%N == y) {
                ok = true;
                System.out.println(i+1);
                break;
            }
        }

        if(!ok) System.out.println(-1);
    }
}
