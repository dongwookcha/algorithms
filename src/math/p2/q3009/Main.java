package math.p2.q3009;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] x = new int[3];
//        int[] y = new int[3];
//        int[] resultX = new int[2];
//        int[] resultY = new int[2];
//
//        for (int i = 0; i < 3; i++) {
//            x[i] = sc.nextInt();
//            y[i] = sc.nextInt();
//        }
//
//        if (x[0] == x[1]) {
//            resultX[0] = x[2];
//        } else if (x[0] == x[2]){
//            resultX[0] = x[1];
//        } else {
//            resultX[0] = x[0];
//        }
//
//        if (y[0] == y[1]) {
//            resultY[0] = y[2];
//        } else if (y[0] == y[2]) {
//            resultY[0] = y[1];
//        } else {
//            resultY[0] = y[0];
//        }
//
//        System.out.println(resultX[0] + " " + resultY[0]);
//    }
//}

// Using ternary operation
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        int resultX, resultY;

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        if (x[0] == x[1]) {
            resultX = x[2];
        } else {
            resultX = (x[0] == x[2]) ? x[1] : x[0];
        }

        if (y[0] == y[1]) {
            resultY = y[2];
        } else {
            resultY = (y[0] == y[2]) ? y[1] : y[0];
        }

        System.out.println(resultX + " " + resultY);
    }
}