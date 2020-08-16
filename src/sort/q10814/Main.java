package sort.q10814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] s = new String[n][2];

        for (int i = 0; i < n; i++) {
            String age = sc.next();
            String name = sc.next();
            s[i][0] = age;
            s[i][1] = name;
        }

        Arrays.sort(s, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
                    return Integer.compare(o1[1].length(), o2[1].length());
                }
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.println(s[i][0] + " " + s[i][1]);
        }
    }
}