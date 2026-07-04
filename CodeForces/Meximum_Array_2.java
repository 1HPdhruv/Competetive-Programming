import java.util.*;
public class Meximum_Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            boolean[] mustK = new boolean[n];
            List<int[]> mex = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                int c = sc.nextInt();
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                if (c == 1) {
                    for (int j = l; j <= r; j++) mustK[j] = true;
                } else {
                    mex.add(new int[]{l, r});
                }
            }
            int INF = 1000000000;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = mustK[i] ? k : INF;
            for (int[] seg : mex) {
                int l = seg[0], r = seg[1];
                boolean[] have = new boolean[Math.max(1, k)];
                for (int i = l; i <= r; i++) if (a[i] >= 0 && a[i] < k) have[a[i]] = true;
                for (int val = 0; val < k; val++) {
                    if (have[val]) continue;
                    int found = -1;
                    for (int i = l; i <= r; i++) {
                        if (!mustK[i] && a[i] > k - 1) { found = i; break; }
                    }
                    if (found == -1) {
                        for (int i = l; i <= r; i++) {
                            if (!mustK[i]) { found = i; break; }
                        }
                    }
                    if (found == -1) continue;
                    a[found] = val;
                    have[val] = true;
                }
                for (int i = l; i <= r; i++) {
                    if (a[i] == k) {
                        int found = -1;
                        for (int j = l; j <= r; j++) if (!mustK[j] && a[j] > k - 1) { found = j; break; }
                        if (found != -1) { a[found] = 0; a[i] = k; }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == INF) a[i] = 0;
                System.out.print(a[i] + (i + 1 == n ? "\n" : " "));
            }
        }
    }
}