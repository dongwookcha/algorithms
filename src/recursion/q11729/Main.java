package recursion.q11729;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int count = 0;
    static ArrayList<String> store = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 1,3,2);
        // output
        System.out.println(count);
        for (String value: store) {
            System.out.println(value);
        }
    }

    private static void hanoi(int n, int start, int to, int via) {
         if (n == 1) {
            move(start, to);
        } else {
             hanoi(n - 1, start, via, to);
             move(start, to);
             hanoi(n - 1, via, to, start);
        }
    }

    private static void move(int from, int to) {
        count++;
        store.add(from + " " + to);
    }
}
