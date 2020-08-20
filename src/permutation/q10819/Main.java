package permutation.q10819;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int ans = 0;

        do {
            int temp = calculate();
            ans = Math.max(ans, temp);
        } while(nextPermutation(n));

        System.out.println(ans);
    }

    public static int calculate() {
        int sum = 0;
        for(int i = 1; i < a.length; i++) {
            sum += Math.abs(a[i] - a[i-1]);
        }
        return sum;
    }

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
}
