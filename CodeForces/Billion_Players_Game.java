import java.util.*;
public class Billion_Players_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            long L = sc.nextLong();
            long R = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long median = a[n / 2];
            long p;
            if (median < L) p = L;
            else if (median > R) p = R;
            else p = median;
            long ans = 0;
            for (long x : a) ans += Math.abs(x - p);
            System.out.println(ans);
        }
    }
}