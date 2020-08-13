package sort.q10989;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] countingArr = new int[10001];

        for(int i = 1; i <= n; i++) {
            int index = Integer.parseInt(br.readLine());
            countingArr[index]++;
        }

        for(int i = 1; i < countingArr.length; i++) {
            while(0 < countingArr[i]--){
                bw.write(Integer.toString(i) + "\n");
            }
        }
        br.close();
        bw.close();
    }
}
