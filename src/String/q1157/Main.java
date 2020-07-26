package String.q1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] cnt = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 65]++;
            if (max < cnt[s.charAt(i) - 65]) {
                max = cnt[s.charAt(i) - 65];
                result = s.charAt(i);
            } else if (max == cnt[s.charAt(i) - 65]) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
