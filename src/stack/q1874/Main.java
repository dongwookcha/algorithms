package stack.q1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int m = 0; // 스택에 추가되어야 하는 수
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int element: A) {
            if (element > m) {
                while (element > m) {
                    stack.push(++m);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if (stack.peek() != element) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }
}
