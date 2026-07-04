import java.util.*;

public class Knights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        for (long i = 1; i <= k; i++) {
            long c = i * i * ((i * i) - 1) / 2;
            long d = (i - 1) * (i - 2) * 4;
            System.out.println(c - d);
        }
    }
}