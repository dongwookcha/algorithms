package math.p2.q1085;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(print(x, y, w, h));
    }

    private static int print(int x, int y, int w, int h){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(h - y);
        arr.add(w - x);
        arr.add(x);
        arr.add(y);

        Collections.sort(arr);
        return arr.get(0);
    }
}
