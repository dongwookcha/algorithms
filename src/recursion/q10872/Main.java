package recursion.q10872;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//    }
//
//    private static int factorial(int n) {
//      int accumulatedNumber = 1;
//
//      while (n > 1) {
//          accumulatedNumber *= n;
//          --n;
//      }
//
//      return accumulatedNumber;
//    };
//}

// recursion ver
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    };
}
