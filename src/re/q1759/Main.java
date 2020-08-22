package re.q1759;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int l;
    static int c;
    static char[] s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        c = sc.nextInt();

        s = new char[c];
        for(int i = 0; i < c; i++) {
            s[i] = sc.next().charAt(0);
        }

        Arrays.sort(s);
        go(0,"", l);
    }

    public static void go(int index, String password, int l) {
        if(password.length() == l){
            if(ok(password)) {
                System.out.println(password);
            }
            return;
        }
        if(index >= s.length) return;

        go(index+1, password+s[index], l);
        go(index+1, password, l);
    }

    public static boolean ok(String password) {
        int ja = 0;
        int mo = 0;

        for(char word: password.toCharArray()) {
            if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
                mo++;
            } else {
               ja++;
            }
        }

        return (mo >= 1 && ja >= 2);
    }
}
