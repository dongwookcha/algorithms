package String.q1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < t; i++) {
            String s = sc.next();

            if (groupWord(s)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean groupWord(String s) {
        if (s.length() == 0) {
            return false;
        }

        if (s.length() == 1) {
            return true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char standard = s.charAt(i);
            if (standard != s.charAt(i + 1)) {
                for (int j = i + 2; j < s.length(); j++) {
                    if (standard == s.charAt(j)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
