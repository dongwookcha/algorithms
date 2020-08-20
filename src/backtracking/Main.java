package backtracking;

import java.util.Scanner;

public class Main {
    static int[] a = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        selection(1, 0, n, m);
    }

    public static void selection(int index, int selected, int n, int m) {
        if(selected == m) {
            for(int i = 0; i < m; i++) {
                System.out.print(a[i]);
                if(i != m-1) System.out.print(" ");
            }
            System.out.println();
            return;
        }

        if(index > n) return;
        // 선택한 경우
        a[selected] = index;
        selection(index+1, selected+1, n, m);
        // 선택하지 않은 경우
        a[selected] = 0;
        selection(index+1, selected, n, m);
    }
}
