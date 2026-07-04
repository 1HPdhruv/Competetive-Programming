import java.util.*;

public class zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long count = 0;
        while (k != 0) {
            k = k / 5;
            count += k;
        }
        System.out.println(count);
    }
}
