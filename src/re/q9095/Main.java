package re.q9095;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(go(0, n));
        }
    }

    public static int go(int value, int n) {
        if(value == n) return 1;
        if(value > n) return 0;

        int sum = 0;
        for(int i = 1; i <= 3; i++) {
            sum += go(value + i, n);
        }

        return sum;
    }
}
