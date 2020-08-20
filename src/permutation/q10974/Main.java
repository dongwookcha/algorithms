package permutation.q10974;

import java.util.Scanner;

public class Main {
    static int[] a;

    public static boolean nextPermutation(int n){
        int i = n-1;
        while(i > 0 && (a[i-1] >= a[i])) {
            i--;
        }
        if(i <= 0) return false;

        int j = n-1;
        while((a[j] <= a[i-1])) {
            j--;
        }
        swap(i-1, j);

        j = n-1;
        while(i < j) {
            swap(i, j);
            i++; j--;
        }

        return true;
    }

    public static void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = i+1;
        }

        do {
            for(int val: a) System.out.print(val + " ");
            System.out.println();
        } while(nextPermutation(n));

    }
}
