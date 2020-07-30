package math.p1.q10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(findRoom(H,W,N));
        }
    }

    private static int findRoom(int height, int width, int n) {
        int room, floor;

        if (n <= height) {
            return Integer.parseInt(n + "" + "01");
        }


        if (n % height == 0) {
            floor = height;
            room = n / height;
            return (room < 10) ? Integer.parseInt(floor + "0" + room) : Integer.parseInt(floor + "" + room);
        }

        floor = n % height;
        room = n / height + 1;

        return (room < 10) ? Integer.parseInt(floor + "0" + room) : Integer.parseInt(floor + "" + room);
    }
}
