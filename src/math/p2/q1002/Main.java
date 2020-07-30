package math.p2.q1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.println(contactPoint(x1, y1, r1, x2, y2, r2));
        }
    }

    private static int contactPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
        // 두 원의 중심이 같고, 반지름도 같을 때 (접점이 무한 => -1)
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // 접점이 없을 때
        // 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때
        if (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) > Math.pow((r2 - r1), 2)) {
            return 0;
        }

        // 반지름의 차가 두 원간의 중점 거리보다 클 때,
        else if (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) < Math.pow((r2 - r1), 2)) {
            return 0;
        }

        // 접점이 있을 때
        // 내점
        else if (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) == Math.pow((r2 - r1), 2)) {
            return 1;
        }

        // 외접
        else if (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) == Math.pow((r2 + r1), 2)) {
            return 1;
        }

        else {
            return 2;
        }
    }
}
