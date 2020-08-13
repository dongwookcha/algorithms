package sort.q2108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] storage = new int[n];

        for(int i = 0; i < n; i++){
            storage[i] = sc.nextInt();
        }

        Arrays.sort(storage);

        System.out.println(mean(storage));
        System.out.println(median(storage));
        System.out.println(mode(storage));
        System.out.println(range(storage));
    }

    public static int mean(int[] arr) {
        double result;
        double sum = 0;
        for(int item: arr) {
            sum += item;
        }
        result = Math.round(sum / arr.length);
        return (int)Math.ceil(result);
    }

    public static int median(int[] arr) {
        return arr[(arr.length/2)];
    }

    public static int mode(int[] arr) {
        int cnt[] = new int [8001];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for(int x:arr) {

            if(x<0) {
                cnt[Math.abs(x)+4000]++;
            }else cnt[x]++;

        }

        int idx =0;
        for(int i=0;i<cnt.length;i++) {
            if(cnt[i]!=0 && cnt[i]>max) {
                max = cnt[i];
                idx = i;
            }
        }

        for(int i=0;i<cnt.length;i++) {
            int x=i;
            if(cnt[i]==max) {
                if(i>4000) {
                    x-=4000;
                    x*=-1;
                    arrayList.add(x);
                }else
                    arrayList.add(i);
            }
        }
        Collections.sort(arrayList);

        if(arrayList.size()>1) return arrayList.get(1);
        else return 	arrayList.get(0);
    }

    public static int range(int[] arr) {
        return arr[arr.length-1] - arr[0];
    }
}
