package String.q5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        String[] arr = { null, null, null, "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS",
        "TUV", "WXYZ"};
        int time = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 3; j < arr.length; j++) {
                if (arr[j].indexOf(s.charAt(i)) != -1) {
                    time += j;
                }
            }
        }

        System.out.println(time);
    }
}
