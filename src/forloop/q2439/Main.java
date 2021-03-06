package forloop.q2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            StringBuilder star = new StringBuilder();
            for (int j = 1; j <= n - i; j++) {
                star.append(" ");
            }

            for (int k = 1; k <= i; k++) {
                star.append("*");
            }

            System.out.println(star);
        }
    }
}
