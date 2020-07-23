package inputoutput.q2588;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int digit;
        int sum = a*b;

        while(b > 0) {
            digit = b%10;
            b /= 10;
            System.out.println(a * digit);
        }
        System.out.println(sum);
    }
}
