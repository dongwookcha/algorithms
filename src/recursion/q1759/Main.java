package recursion.q1759;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();
        String[] alpha = new String[c];

        for(int i = 0; i < c; i++) {
            alpha[i] = sc.next();
        }

        Arrays.sort(alpha);
        recursion(l, alpha, "", 0);
    }

    public static void recursion(int n, String[] alpha, String password, int i) {
        if(n == password.length()) {
            if(check(password)) {
                System.out.println(password);
            }
            return;
        }
        if(i >= alpha.length) return;

        recursion(n, alpha, password + alpha[i], i+1);
        recursion(n, alpha, password, i+1);
    }

    public static boolean check(String password) {
        int ja = 0;
        int mo = 0;

        for(int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            if( x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo++;
            } else {
                ja++;
            }
        }
        return (ja >= 2) && (mo >= 1);
    }
}
