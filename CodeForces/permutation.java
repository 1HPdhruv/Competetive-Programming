import java.io.*;
import java.util.*;

public class permutation {
    static int n, m;
    static int[][] bits;
    static boolean[] used;
    static int[][] vals;
    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine().trim());
            m = 0;
            while ((1 << m) <= n)
                m++;
            bits = new int[m][n];
            for (int i = 0; i < m; i++) {
                String line = br.readLine().trim();
                for (int j = 0; j < n; j++)
                    bits[i][j] = line.charAt(j) - '0';
            }
            used = new boolean[m];
            vals = new int[m + 1][n];
            count = 0;
            solve(0);
            out.append(count).append('\n');
        }
        System.out.print(out);
    }

    static void solve(int pos) {
        if (pos == m) {
            boolean[] seen = new boolean[n + 2];
            for (int v : vals[pos]) {
                if (v < 1 || v > n || seen[v])
                    return;
                seen[v] = true;
            }
            count++;
            return;
        }
        int futureMask = 0;
        for (int b = pos + 1; b < m; b++)
            futureMask |= (1 << b);

        for (int i = 0; i < m; i++) {
            if (used[i])
                continue;
            used[i] = true;
            boolean valid = true;
            for (int j = 0; j < n; j++) {
                vals[pos + 1][j] = vals[pos][j] | (bits[i][j] << pos);
                if (vals[pos + 1][j] > n) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                solve(pos + 1);
            used[i] = false;
        }
    }
}