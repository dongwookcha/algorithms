package String.q2908;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = reverseNumber(sc.nextInt());
//        int b = reverseNumber(sc.nextInt());
//
//        System.out.println(Math.max(a, b));
//    }
//
//    static int reverseNumber(int n) {
//        int originalNumber = n;
//        String reversedNumber = "";
//
//        while(originalNumber > 0) {
//            reversedNumber += originalNumber % 10;
//            originalNumber /= 10;
//        }
//
//        return Integer.parseInt(reversedNumber);
//    }
//}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(new StringBuilder().append(sc.nextInt()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder().append(sc.nextInt()).reverse().toString());

        System.out.println(Math.max(a, b));
    }
}