package p13.algorithm.findmax;

import java.util.Scanner;

/**
 * Q) 3개의 정숫값을 입력하고 최댓값을 구합니다.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//
//        System.out.println("세 정수의 최댓값을 구합니다.");
//        System.out.println("a의 값: "); int a = sc.nextInt();
//        System.out.println("b의 값: "); int b = sc.nextInt();
//        System.out.println("c의 값: "); int c = sc.nextInt();
//
//        int max = a;
//
//        if (b > max) max = b;
//        if (c > max) max = c;
//
//        System.out.println("최댓값: " + max);

        int max4 = max4(6, 8,2,1);
        System.out.println("네 값의 최댓값: " + max4);

        int min3 = min3(30, -23, 50);
        System.out.println("세 값의 최솟값: " +  min3);
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    static int median(int a, int b, int c) {
        int median = a;

        // write median logic

        return median;
    }
}
