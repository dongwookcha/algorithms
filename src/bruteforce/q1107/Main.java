package bruteforce.q1107;

import java.util.Scanner;

public class Main {
    static boolean[] broken;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        broken = new boolean[10];
        int ans;

        for(int i = 0; i < m; i++) {
            int index = sc.nextInt();
            broken[index] = true;
        }

        ans = n - 100;
        if (n < 100) {
            ans = -ans;
        }

        for(int i = 0; i <= 1000000; i++) {
            int c = i;
            int len = possible(c);
            if (len > 0) {
                int press = c - n;
                if(press < 0) {
                    press = -press;
                }
                if(ans > len + press){
                    ans = len + press;
                }
            }
        }
        System.out.println(ans);
    }

    public static int possible(int c) {
        if (c==0) {
            return broken[0] ? 0 : 1;
        }
        int len = 0;
        while(c>0) {
            if(broken[c%10]) return 0;
            len += 1;
            c /= 10;
        }
        return len;
    }
}
