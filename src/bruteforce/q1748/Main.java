package bruteforce.q1748;

import java.util.Scanner;

// 건너 뛰는 방식
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;

        for(int start = 1, len = 1; start <= n; start *= 10, len++) {
            int end = start*10-1;
            if (end > n) {
                end = n;
            }
            ans += (end - start + 1) * len;
        }

        System.out.println(ans);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int digit = 0;
//
//        for(int i = 1; i <= N; i++) {
//            digit += (int)(Math.log10(i) + 1);
//        }
//
//        System.out.println(digit);
//    }
//}
