package array.q2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int abc = a * b * c;
        int[] digitArray = new int[10];

        for (int i = 0; i < 10; i++) {
            int copiedAbc = abc;

            while(copiedAbc > 0) {
                int first = copiedAbc % 10;
                copiedAbc /= 10;

                if (first == i) {
                    digitArray[i]++;
                }
            }
        }

        for (int value: digitArray) {
            System.out.println(value);
        }
    }
}
