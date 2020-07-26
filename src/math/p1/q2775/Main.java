package math.p1.q2775;

import java.util.Scanner;

// recursion way
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i = 0; i < testcase; i++) {
            int floor = sc.nextInt();
            int room = sc.nextInt();
            System.out.println(recursion(floor, room));
        }
    }

    private static int recursion(int floor, int room) {
        if (room == 0) {
            return 0;
        } else if (floor == 0) {
            return room;
        } else {
            return recursion(floor - 1, room) + recursion(floor, room - 1);
        }
    }
}

// 2d array way
