package array.q1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numArray = new int[n];
        int max;
        double sum = 0;
        double result;

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt();
        }

        max = numArray[0];

        for (int value: numArray) {
            if (max < value) {
                max = value;
            }
        }

        for (int value: numArray) {
            sum += ((double) value)/ max * 100;
        }

        result = sum / n;
        System.out.println(result);
    }
}
