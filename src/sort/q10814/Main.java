package sort.q10814;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] s = new String[n][2];

        for(int i = 0; i < n; i++) {
            s[i][0] = sc.next();
            s[i][1] = sc.next();
        }

//        Collections.sort(s, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//            }
//        });
    }
}


// Timeout Failure Code
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] age = new int [n];
//        String[] name = new String [n];
//        int[] order = new int [n];
//
//        for(int i = 0; i < n; i++) {
//            age[i] = sc.nextInt();
//            name[i] = sc.next();
//            order[i] = i;
//        }
//
//        for(int i = 1; i < n; i++) {
//            for(int j = 0; j < i; j++) {
//                if(age[i] < age[j]) {
//                    int tempAge = age[i];
//                    age[i] = age[j];
//                    age[j]= tempAge;
//
//                    String tempName = name[i];
//                    name[i] = name[j];
//                    name[j]= tempName;
//
//                    int tempOrder = order[i];
//                    order[i] = order[j];
//                    order[j]= tempOrder;
//
//                } else if(age[i] == age[j] && order[i] < order[j]) {
//                    int tempAge = age[i];
//                    age[i] = age[j];
//                    age[j]= tempAge;
//
//                    String tempName = name[i];
//                    name[i] = name[j];
//                    name[j]= tempName;
//
//                    int tempOrder = order[i];
//                    order[i] = order[j];
//                    order[j]= tempOrder;
//                }
//            }
//        }
//
//
//        for(int i = 0; i < n; i++) System.out.println(age[i] + " " + name[i]);
//    }
//}
