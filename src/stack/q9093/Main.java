package stack.q9093;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        sc.nextLine();
//
//        while (T-- > 0) {
//            String[] arr = sc.nextLine().split(" ");
//            String result = "";
//
//            for (String s : arr) {
//                result += new StringBuilder(s).reverse();
//                result += " ";
//            }
//
//            System.out.println(result);
//        }
//
//    }
//}




// timeout failure
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        sc.nextLine();
//
//        while (T-- > 0) {
//            String str = sc.nextLine() + "\n";
//            Stack<Character> stack = new Stack<>();
//
//            for (char element: str.toCharArray()) {
//                if (element == ' ') {
//                    while(!stack.isEmpty()) {
//                        System.out.print(stack.pop());
//                    }
//                    System.out.print(" ");
//                } else {
//                    stack.push(element);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// Using stack, bf and bw
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            String str = br.readLine() + " ";
            Stack<Character> stack = new Stack<>();

            for (char element: str.toCharArray()) {
                if (element == ' ') {
                    while(!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(element);
                } else {
                    stack.push(element);
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}