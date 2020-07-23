package whileloop.q1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int one; // 일의 자리
        int two; // 십의 자리
        int tempOne; // 임의의 일의 자리

        one = n % 10;
        two = n / 10;

        while (true) {
            cnt++;

            tempOne = one;
            one = (two + one) % 10;
            two = tempOne;

            if (n == (two * 10 + one)) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
