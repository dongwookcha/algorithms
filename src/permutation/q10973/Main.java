package permutation.q10973;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        if(prevPermutation(n)) {
            for(int val: a) System.out.print(val + " ");
        } else {
            System.out.println(-1);
        }
    }

    public static boolean prevPermutation(int n) {
        int i = n-1;
        while(i > 0 && (a[i] >= a[i - 1])) i--;
        if(i <= 0) return false;

        int j = a.length - 1;
        while(a[i-1] <= a[j]) j--;
        swap(i-1, j);

        j = a.length-1;
        while(i < j) {
            swap(i,j);
            i++; j--;
        }

        return true;
    }

    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
