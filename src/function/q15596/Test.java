package function.q15596;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        sum(array);
    }

    static long sum(int[] a) {
        int sum = 0;

        for (int value: a) {
            sum += value;
        }

        return sum;
    }
}
