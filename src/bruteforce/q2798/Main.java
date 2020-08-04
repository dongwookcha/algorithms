package bruteforce.q2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] store = new int[n];

        for (int i = 0; i < n; i++) {
            store[i] = sc.nextInt();
        }

        System.out.println(findNum(store, m));
    }

    private static int findNum(int[] arr, int max) {
        int nearbyMax = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum =  arr[i] + arr[j] + arr[k];
                    if ((nearbyMax < sum) && (sum <= max)) {
                        nearbyMax = sum;
                    }
                }
            }
        }

        return nearbyMax;
    }
}
