package String.q1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arr = s.split(" ");
            System.out.println(arr.length);
        }
    }
}
