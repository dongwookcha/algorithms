package recursion.q11729;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int cnt = 0;
    static ArrayList<String> store = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 1, 2, 3);
        System.out.println(cnt);
        for(String value: store) {
            System.out.println(value);
        }
    }

    private static void hanoi(int n, int start, int via, int end) {
        if (n == 1) {
            move(start, end);
        } else {
            hanoi(n - 1, start, end, via);
            move(start, end);
            hanoi(n - 1, via, end, start);
        }
    }

    private static void move(int start, int end) {
        cnt++;
        store.add(start + " " + end);
    }
}
