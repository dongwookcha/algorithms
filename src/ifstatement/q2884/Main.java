package ifstatement.q2884;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (hour == 0 && (min >= 0 && min <= 44)) {
            hour = 23;
            min = min + 60 - 45;
        } else if (min >= 0 && min <= 44) {
            hour = hour - 1;
            min = min + 60 - 45;
        } else {
            min = min - 45;
        }
        System.out.println(hour + " " + min);
    }
}
