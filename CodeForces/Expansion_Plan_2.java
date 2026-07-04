import java.util.*;
public class Expansion_Plan_2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.hasNextInt() ? sc.nextInt() : 1;
        for (int tt = 0; tt < t; tt++) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            String s = sc.next();
            long k = 0;
            for (char c : s.toCharArray()) if (c == '8') k++;
            long m = n - k;
            long ax = Math.abs(x), ay = Math.abs(y);
            long dx = Math.max(0L, ax - k);
            long dy = Math.max(0L, ay - k);
            System.out.println((dx + dy <= m) ? "YES" : "NO");
        }
    }
}