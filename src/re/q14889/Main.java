package re.q14889;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] s;
    static ArrayList<Integer> first = new ArrayList<>();
    static ArrayList<Integer> second = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                s[i][j] = sc.nextInt();
            }
        }

        System.out.println(go(0, first, second));
    }

    public static int go(int index, ArrayList<Integer> first, ArrayList<Integer> second) {
        if(index == n) {
            int t1 = 0;
            int t2 = 0;
            for(int i = 0; i < n/2; i++) {
                for(int j = 0; j < n/2; j++) {
                    if(i == j) continue;
                    t1 += s[first.get(i)][first.get(j)];
                    t2 += s[second.get(i)][second.get(j)];
                }
            }
            int diff = Math.abs(t1-t2);
            return diff;
        }

        int ans = -1;
        first.add(index);
        int t1 = go(index+1, first,second);
        if(ans == -1 || (t1 != -1 && ans > t1)){
            ans = t1;
        }
        first.remove(first.size()-1);
        second.add(index);
        int t2 = go(index+1, first,second);
        if(ans == -1 || (t2 != -1 && ans > t2)) {
            ans=t2;
        }
        second.remove(index);
        return ans;
    }
}
