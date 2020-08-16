package sort.q11650;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coordinate = new int[n][2]; // 0-x좌표 1-y좌표

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                coordinate[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(coordinate, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
                return Integer.compare(o1[0], o2[0]);
            }
        });

        for(int i = 0; i < coordinate.length; i++) System.out.println(coordinate[i][0] + " " + coordinate[i][1]);

    }
}


// Timeout Failure Code
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] x = new int[n];
//        int[] y = new int[n];
//
//        for(int i = 0; i < n; i++){
//            x[i] = sc.nextInt();
//            y[i] = sc.nextInt();
//        }
//
//        for(int i = 1; i < n; i++) {
//            for(int j = 0; j < i; j++) {
//                if(x[i] <= x[j] && y[i] < y[j]) {
//                    int tempX = x[i];
//                    x[i] = x[j];
//                    x[j] = tempX;
//                    int tempY = y[i];
//                    y[i] = y[j];
//                    y[j] = tempY;
//                }
//            }
//        }
//
//        for(int i = 0; i < n; i++) System.out.println(x[i] + " " + y[i]);
//    }
//}
