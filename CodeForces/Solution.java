import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            long opt1 = (n + x + y - 1) / (x + y);

            long opt2;
            long during = x * z;
            if (during >= n) {
                opt2 = (n + x - 1) / x;
            } else {
                long remaining = n - during;
                opt2 = z + (remaining + x + 10 * y - 1) / (x + 10 * y);
            }

            System.out.println(Math.min(opt1, opt2));
        }
        sc.close();
    }
}
