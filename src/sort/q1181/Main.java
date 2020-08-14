package sort.q1181;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> s = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String temp = sc.next();
            if(!s.contains(temp)) {
                s.add(temp);
            }
        }

        Collections.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                return Integer.compare(o1.length(), o2.length());
            }
        });

        for(String str: s) System.out.println(str);
    }
}
