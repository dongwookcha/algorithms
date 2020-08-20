package backtracking.q15652;

import java.util.Scanner;

// 선택
public class Main {
    static int[] a = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        selection(1,0, n, m);
    }

    public static void selection(int index, int selected, int n, int m) {
        if(selected == m) {
            for(int i = 0; i < m; i++) {
                System.out.print(a[i]);
                if(i != m -1) System.out.print(' ');
            }
            System.out.println();
            return;
        }

        if(index > n) return;
        for(int i = m-selected; i >= 1; i--) {
            a[index] = i;
            selection(index+1, selected+i, n, m);
        }
        a[index] = 0;
        selection(index+1, selected, n, m);
    }
}

// 순서
//public class Main {
//    static boolean[] c = new boolean[10];
//    static int[] a = new int[10];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        recursion(0,1, n, m);
//    }
//
//    public static void recursion(int index, int start, int n, int m) {
//        if(index == m) {
//            for(int i = 0; i < m; i++) {
//                System.out.print(a[i]);
//                if(i != m -1) System.out.print(' ');
//            }
//            System.out.println();
//            return;
//        }
//
//        for(int i = start; i <= n; i++) {
//            a[index] = i;
//            recursion(index + 1, i, n, m);
//        }
//    }
//}