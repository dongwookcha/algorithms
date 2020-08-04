package bruteforce.q1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 메모리 초과
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        boolean[] arr = new boolean[9999999];
//        int cnt = 0;
//
//        for (int i = 666; i < arr.length; i++) {
//            String isSix = String.valueOf(i);
//            for (int j = 0; j < isSix.length() - 2; j++) {
//                if (isSix.charAt(j) == '6' && isSix.charAt(j + 1) == '6' && isSix.charAt(j + 2) == '6') {
//                    arr[i] = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]) {
//                cnt++;
//                if (N == cnt) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }
//    }
//}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int num = 0;
        int cnt = 0;

        while(true) {
            ++num;
            if (String.valueOf(num).contains("666")) {
                ++cnt;
                if (N == cnt) {
                    System.out.println(num);
                    break;
                }
            }
        }

    }
}