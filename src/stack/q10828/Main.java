package stack.q10828;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] stack = new int[N];
        int size = 0;

        while(N-- > 0) {
            String cmd = sc.next();

            if (cmd.equals("push")) {
                int data = Integer.parseInt(sc.next());
                stack[size++] = data;
            } else if (cmd.equals("pop")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size - 1]);
                    size--;
                }
            } else if (cmd.equals("size")) {
                System.out.println(size);
            } else if (cmd.equals("empty")) {
                if (size == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("top")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size - 1]);
                }
            }

        }

    }
}