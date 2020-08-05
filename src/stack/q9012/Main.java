package stack.q9012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            String ps = sc.next();
            int cnt = 0;

            for (int i = 0; i < ps.length(); i++) {
                if (ps.charAt(i) == '(') {
                    cnt++;
                } else if (ps.charAt(i) == ')') {
                    cnt--;
                }
                if (cnt == -1) {
                    break;
                }
            }

            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
