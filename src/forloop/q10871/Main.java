package forloop.q10871;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int a = sc.nextInt();
//            if (x > a) {
//                System.out.println(a);
//            }
//        }
//    }
//}

// Other solution using by array
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        StringBuilder result = new StringBuilder();

        int[] intArray = new int[n];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }

        for (int value : intArray) {
            if (x > value) {
                result.append(value).append(" ");
            }
        }

        System.out.println(result);
    }
}