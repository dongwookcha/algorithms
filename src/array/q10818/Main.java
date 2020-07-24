package array.q10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArray = new int[n];
        int max;
        int min;

        for (int i = 0; i < n; i++) {
            numArray[i] = sc.nextInt();
        }

        max = numArray[0];
        min = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (max < numArray[i]) {
                max = numArray[i];
            }

            if (min > numArray[i]) {
                min = numArray[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
