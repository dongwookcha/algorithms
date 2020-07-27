package math.p2.q3053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.6f", euclidean(r));
        System.out.println();
        System.out.printf("%.6f", taxiGeometry(r));
    }

    private static double euclidean(int n) {
        return Math.PI * Math.pow(n, 2);
    }

    private static double taxiGeometry(int n) {
        return 2 * Math.pow(n, 2);
    }
}
