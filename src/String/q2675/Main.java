package String.q2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            System.out.println(print(s, r));
        }
    }

    private static String print(String s, int r) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < r; j++) {
                result += s.charAt(i);
            }
        }

        return result;
    }
}
