package math.p1.q2869;

import java.util.Scanner;

// Test failed because this logic was trapped by timeout;;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 낮 동안 올라간 거리
        int b = sc.nextInt(); // 밤 동안 내려간 거리
        int v = sc.nextInt(); // 높이

        int days = 0;
        int h = 0; // 현재까지 올라간 높이

        while (h < v) {
            days++;
            h += a;
            if (h >= v) break;
            h -= b;
        }

        System.out.println(days);
    }
}
