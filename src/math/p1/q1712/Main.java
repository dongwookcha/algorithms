package math.p1.q1712;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int bep = 1;
//
//        if (b > c) {
//            bep = -1;
//            System.out.println(bep);
//            return;
//        }
//
//        while (true) {
//            if ((c - b) * bep < a) {
//                bep++;
//            } else {
//                break;
//            }
//        }
//
//        System.out.println(bep + 1);
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b >= c) {
            System.out.println(-1);
        } else {
            System.out.println(a / (c - b) + 1);
        }
    }
}