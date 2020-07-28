package function.q4673;

public class Main {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            if (dn(i) <= 10000) {
                isNotSelfNumber[dn(i)] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!isNotSelfNumber[i]) {
                System.out.println(i);
            }
        }
    }

    private static int dn(int n) {
        int sum = n;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
