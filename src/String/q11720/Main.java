package String.q11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String n = sc.next();
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - 48;
        }

        System.out.println(sum);
    }
}
