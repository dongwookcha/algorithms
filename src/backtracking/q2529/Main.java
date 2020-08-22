package backtracking.q2529;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<String> ans = new ArrayList<String>();
    static char[] a;
    static boolean[] c = new boolean[10];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new char[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.next().charAt(0);
        }

        go(0, "");
        Collections.sort(ans);
        int m = ans.size();
        System.out.println(ans.get(m-1));
        System.out.println(ans.get(0));
    }

    public static void go(int index, String num) {
        if(index == n+1) {
            if(ok(num)) {
                ans.add(num);
            }
            return;
        }

        for(int i = 0; i <= 9; i++) {
            if(c[i]) continue;
            c[i] = true;
            go(index+1, num+Integer.toString(i));
            c[i] = false;
        }
    }

    public static boolean ok(String num) {
        for(int i = 0; i < n; i++) {
            if(a[i] == '<') {
                if(num.charAt(i) > num.charAt(i+1)) return false;
            } else if(a[i] == '>') {
                if(num.charAt(i) < num.charAt(i+1)) return false;
            }
        }
        return true;
    }
}
