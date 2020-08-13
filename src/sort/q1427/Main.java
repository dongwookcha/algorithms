package sort.q1427;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = (int)(Math.log10(n) + 1);
        Integer[] s = new Integer[length];
        String a = String.valueOf(n);

        for(int i = 0; i < a.length(); i++) {
            s[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }

        Arrays.sort(s, Collections.reverseOrder());

        for(Integer i: s) System.out.print(i);
    }
}
