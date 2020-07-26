package String.q2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();

        String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String value : croatiaAlphabet) {
            if (s.contains(value)) {
                s = s.replaceAll(value, "*");
            }
        }

        System.out.println(s.length());
    }
}
