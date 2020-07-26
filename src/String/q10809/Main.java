package String.q10809;

import java.util.Arrays;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int[] array = new int[26];
//        Arrays.fill(array, -1);
//        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//
//        for (int i = 0; i < alphabet.length; i++) {
//            for (int j = 0; j < s.length(); j++) {
//                // if exists same alphabet, ignore it.
//                if (array[i] != -1) {
//                    break;
//                }
//
//                if (s.charAt(j) == alphabet[i]) {
//                    array[i] = j;
//                }
//            }
//        }
//
//        String result = "";
//
//        for (int value: array) {
//            result += value + " ";
//        }
//
//        System.out.println(result.trim());
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " ");
        }
    }
}