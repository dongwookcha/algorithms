package stack.q1406;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());


        Stack<String> x = new Stack<>(); // 커서 기준 왼쪽
        Stack<String> y = new Stack<>(); // 커서 기준 오른쪽

        for (int i = 0; i < str.length(); i++) {
            x.push(String.valueOf(str.charAt(i)));
        }

        while (M-- > 0) {
            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("L")) {
                if (x.isEmpty()) {

                } else {
                    y.push(x.pop());
                }
            } else if (cmd[0].equals("D")) {
                if (y.isEmpty()) {

                } else {
                    x.push(y.pop());
                }

            } else if (cmd[0].equals("B")) {
                if (x.isEmpty()) {

                } else {
                    x.pop();
                }
            } else if (cmd[0].equals("P")) {
                x.push(cmd[1]);
            }
        }


        while (!x.isEmpty()) { ;
            y.push(x.pop());
        }

        while (!y.isEmpty()) {
            sb.append(y.pop());
        }

        System.out.println(sb);
    }
}
