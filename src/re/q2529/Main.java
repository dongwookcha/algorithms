package re.q2529;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int k;
    static char[] a;
    static boolean[] check = new boolean[10];
    static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        a = new char[k];

        for(int i = 0; i < k; i++) {
            a[i] = sc.next().charAt(0);
        }

        go(0, "");

        Collections.sort(ans);
        System.out.println(ans.get(ans.size()-1));
        System.out.println(ans.get(0));
    }

    public static void go(int index, String num) {
        if(index == k+1) {
            if(ok(num)) {
                ans.add(num);
            }
            return;
        }

        if(index > k+1) return;

        for(int i = 0; i <= 9; i++) {
            if(check[i]) continue;
            check[i] = true;
            go(index+1, num + i);
            check[i] = false;
        }
    }

    public static boolean ok(String num) {
        for(int i = 0; i < num.length()-1; i++) {
            if(a[i] == '<') {
                if(num.charAt(i) > num.charAt(i+1)) return false;
            } else if(a[i] == '>') {
                if(num.charAt(i) < num.charAt(i+1)) return false;
            }
        }
        return true;
    }
}
